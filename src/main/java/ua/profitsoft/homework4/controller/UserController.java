package ua.profitsoft.homework4.controller;

import ua.profitsoft.homework4.dto.UserDto;
import ua.profitsoft.homework4.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    private final UserServiceImpl service;

    public UserController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String welcome(Model model, HttpSession session,
                          @RequestParam String login, @RequestParam String password) {
        if (service.findByLogin(login).isPresent()) {
            UserDto user = service.findByLogin(login).get();
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                session.setAttribute("user", user);
                session.setMaxInactiveInterval(10 * 60);
                return "redirect:/welcome";
            }
        }
        model.addAttribute("errorMsg", "Incorrect login or password");
        return "login";
    }

    @GetMapping("/welcome")
    public String welcomeUser(HttpSession session) {
        if (session.getAttribute("user") == null)
            return "redirect:/login";
        session.getAttribute("user");
        return "welcome";
    }

    @GetMapping("/users")
    public String users(HttpSession session, Model model) {
        if (session.getAttribute("user") == null)
            return "redirect:/login";
        model.addAttribute("usersList", service.findUsers());
        return "users";
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/login";
    }
}
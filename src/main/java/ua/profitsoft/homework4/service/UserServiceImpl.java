package ua.profitsoft.homework4.service;

import ua.profitsoft.homework4.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserServiceImpl implements UserService {
    Map<Integer, UserDto> users = new ConcurrentHashMap<>(
            Map.of(1, new UserDto("Tim", "admin", "admin"),
            2, new UserDto("Romeo", "user", "user"),
            3, new UserDto("Gerald", "editor", "editor"),
            4, new UserDto("Admin", "Adminchenko", "weddingdate"),
            5, new UserDto("Alex", "localhost", "8080")));

    @Override
    public List<UserDto> findUsers() {
        return users.values().stream().toList();
    }

    @Override
    public Optional<UserDto> findByLogin(String login) {
        return users.values().stream()
                .filter(user -> login.equals(user.getLogin()))
                .findFirst();
    }
}

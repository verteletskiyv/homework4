package ua.profitsoft.homework4.service;

import ua.profitsoft.homework4.dto.UserDto;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    List<UserDto> users = List.of(new UserDto("Tim", "admin", "admin"),
                                 new UserDto("Romeo", "user", "user"),
                                 new UserDto("Gerald", "editor", "editor"),
                                 new UserDto("Ahmed", "tutor", "tutor"),
                                 new UserDto("Alex", "localhost", "8080"));

    @Override
    public List<UserDto> findUsers() {
        return users;
    }

    @Override
    public Optional<UserDto> findByLogin(String login) {
        return users.stream()
                .filter(user -> login.equals(user.getLogin()))
                .findFirst();
    }
}

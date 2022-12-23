package ua.profitsoft.homework4.service;

import ua.profitsoft.homework4.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> findUsers();
    Optional<UserDto> findByLogin(String login);
}

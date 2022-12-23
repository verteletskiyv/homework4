package ua.profitsoft.homework4.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserDto {
    private String name;
    private String login;
    private String password;
}

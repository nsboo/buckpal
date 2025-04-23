package io.reflectoring.user.adapter.in.web;

import io.reflectoring.buckpal.common.WebAdapter;
import io.reflectoring.user.adapter.in.web.dto.UserDto;
import io.reflectoring.user.application.domain.model.User;
import io.reflectoring.user.application.port.in.RegisterUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterUserController {
    private final RegisterUserUseCase registerUserUseCase;

    @PostMapping("/user/register")
    void register(UserDto userDto) {
        registerUserUseCase.registerUser(new User(userDto.email(), userDto.password()));
    }
}

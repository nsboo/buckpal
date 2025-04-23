package io.reflectoring.user.adapter.in.web;

import io.reflectoring.buckpal.common.WebAdapter;
import io.reflectoring.user.application.domain.model.LoginInfo;
import io.reflectoring.user.application.port.in.LoginUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginUseCase loginUseCase;

    @PostMapping("/login")
    void login(LoginInfo loginInfo) {
        loginUseCase.login(loginInfo);
    }
}


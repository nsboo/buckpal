package io.reflectoring.user.application.domain.service;


import io.reflectoring.buckpal.common.UseCase;
import io.reflectoring.user.application.domain.model.LoginInfo;
import io.reflectoring.user.application.port.in.LoginUseCase;
import io.reflectoring.user.application.port.out.LoginPort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class LoginService implements LoginUseCase {
    private final LoginPort loginPort;

    @Override
    public void login(LoginInfo loginInfo) {
        if (!loginPort.match(loginInfo)) {
            throw new IllegalArgumentException("Invalid username or password");
        }

        // ...
    }
}

package io.reflectoring.user.application.domain.service;

import io.reflectoring.buckpal.common.UseCase;
import io.reflectoring.user.application.domain.model.User;
import io.reflectoring.user.application.port.in.RegisterUserUseCase;
import io.reflectoring.user.application.port.out.CheckUserEmailPort;
import io.reflectoring.user.application.port.out.SaveUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class RegisterUserService implements RegisterUserUseCase {
    private final SaveUserPort saveUserPort;
    private final CheckUserEmailPort checkUserEmailPort;

    @Override
    public void registerUser(User user) {
        if (!checkUserEmailPort.isUnique(user.email())) {
            throw new IllegalArgumentException("Email already exists");
        }

        saveUserPort.save(user);
    }
}

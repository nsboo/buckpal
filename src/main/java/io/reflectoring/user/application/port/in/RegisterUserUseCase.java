package io.reflectoring.user.application.port.in;

import io.reflectoring.user.application.domain.model.User;

public interface RegisterUserUseCase {
    void registerUser(User user);
}

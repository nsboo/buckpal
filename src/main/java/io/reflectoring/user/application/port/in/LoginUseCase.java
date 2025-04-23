package io.reflectoring.user.application.port.in;

import io.reflectoring.user.application.domain.model.LoginInfo;

public interface LoginUseCase {
    void login(LoginInfo loginInfo);
}

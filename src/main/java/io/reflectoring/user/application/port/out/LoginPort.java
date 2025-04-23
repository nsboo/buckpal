package io.reflectoring.user.application.port.out;

import io.reflectoring.user.application.domain.model.LoginInfo;

public interface LoginPort {
    boolean match(LoginInfo loginInfo);
}

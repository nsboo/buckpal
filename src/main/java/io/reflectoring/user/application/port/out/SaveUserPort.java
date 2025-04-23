package io.reflectoring.user.application.port.out;

import io.reflectoring.user.application.domain.model.User;

public interface SaveUserPort {
    void save(User user);
}

package io.reflectoring.user.application.domain.model;

import lombok.Getter;

@Getter
public record User(
    String email,
    String password) {
}

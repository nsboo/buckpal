package io.reflectoring.user.application.port.out;

public interface CheckUserEmailPort {
    boolean isUnique(String email);
}

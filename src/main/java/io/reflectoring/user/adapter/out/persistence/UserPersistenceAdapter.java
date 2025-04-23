package io.reflectoring.user.adapter.out.persistence;

import io.reflectoring.buckpal.common.UseCase;
import io.reflectoring.user.application.domain.model.User;
import io.reflectoring.user.application.port.out.CheckUserEmailPort;
import io.reflectoring.user.application.port.out.SaveUserPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
@Transactional
public class UserPersistenceAdapter implements CheckUserEmailPort, SaveUserPort {
    private final UserRepository userRepository;

    @Override
    public boolean isUnique(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public void save(User user) {
        userRepository.save(new UserJpaEntity(user.email(), user.password()));
    }
}

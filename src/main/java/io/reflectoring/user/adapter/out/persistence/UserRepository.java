package io.reflectoring.user.adapter.out.persistence;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserJpaEntity, Long> {
    boolean existsByEmail(String email);

    Optional<UserJpaEntity> findByEmail(String email);
}

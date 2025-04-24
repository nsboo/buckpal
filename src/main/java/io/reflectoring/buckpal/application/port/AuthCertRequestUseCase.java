package io.reflectoring.buckpal.application.port;

import io.reflectoring.buckpal.application.domain.model.AuthCertRequest;

public interface AuthCertRequestUseCase {
    byte[] processRequest(AuthCertRequest authCertRequest);
}

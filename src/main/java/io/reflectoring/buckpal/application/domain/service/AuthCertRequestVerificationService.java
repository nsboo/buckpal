package io.reflectoring.buckpal.application.domain.service;

import io.reflectoring.buckpal.application.domain.model.AuthCertRequest;
import io.reflectoring.buckpal.application.domain.model.AuthCertRequestEvent;
import org.springframework.stereotype.Service;

@Service
public class AuthCertRequestVerificationService {
    public AuthCertRequestEvent verifyAuthCertRequest(AuthCertRequest request) {
        // ...

        return new AuthCertRequestEvent(this, request);
    }
}

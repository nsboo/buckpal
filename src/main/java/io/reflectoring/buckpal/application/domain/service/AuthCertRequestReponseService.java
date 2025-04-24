package io.reflectoring.buckpal.application.domain.service;

import io.reflectoring.buckpal.application.domain.model.AuthCertRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthCertRequestReponseService {
    public byte[] generateResponse(AuthCertRequest unused) {
        // ...

        return new byte[0];
    }
}

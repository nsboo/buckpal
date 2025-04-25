package io.reflectoring.buckpal.adapter.in.internal;

import io.reflectoring.buckpal.application.domain.model.AuthCertRequestEvent;
import io.reflectoring.buckpal.application.domain.service.AuthCertGenerationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@RequiredArgsConstructor
public class AuthCertRequestEventHandler {
    private final AuthCertGenerationService authCertGenerationService;

    @TransactionalEventListener
    public void generateAuthCert(AuthCertRequestEvent event) {
        authCertGenerationService.generate(event.getAuthCertRequest());
    }
}

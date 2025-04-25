package io.reflectoring.buckpal.adapter.in.internal;

import io.reflectoring.buckpal.application.domain.model.AuthCertRequestEvent;
import io.reflectoring.buckpal.application.domain.service.AuthCertGenerationService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthCertRequestEventHandler {
    private final AuthCertGenerationService authCertGenerationService;

    @Async // @Configuration에서 @EnableAsync 필요
    @EventListener
    public void generateAuthCert(AuthCertRequestEvent event) {
        authCertGenerationService.generate(event.getAuthCertRequest());
    }
}

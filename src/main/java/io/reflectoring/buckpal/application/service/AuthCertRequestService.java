package io.reflectoring.buckpal.application.service;

import io.reflectoring.buckpal.application.domain.model.AuthCertRequest;
import io.reflectoring.buckpal.application.domain.model.AuthCertRequestEvent;
import io.reflectoring.buckpal.application.domain.service.AuthCertRequestReponseService;
import io.reflectoring.buckpal.application.domain.service.AuthCertRequestVerificationService;
import io.reflectoring.buckpal.application.port.AuthCertRequestUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
public class AuthCertRequestService implements AuthCertRequestUseCase {
    private final AuthCertRequestVerificationService verificationService;
    private final AuthCertRequestReponseService responseService;
    private final ApplicationEventPublisher eventPublisher;


    @Override
    public byte[] processRequest(AuthCertRequest authCertRequest) {
        AuthCertRequestEvent event = verificationService.verifyAuthCertRequest(authCertRequest);
        eventPublisher.publishEvent(event);
        return responseService.generateResponse(authCertRequest);
    }
}

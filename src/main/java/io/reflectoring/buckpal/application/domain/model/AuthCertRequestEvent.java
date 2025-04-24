package io.reflectoring.buckpal.application.domain.model;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class AuthCertRequestEvent extends ApplicationEvent {
    private final AuthCertRequest authCertRequest;

    public AuthCertRequestEvent(Object source, AuthCertRequest authCertRequest) {
        super(source);
        this.authCertRequest = authCertRequest;
    }
}

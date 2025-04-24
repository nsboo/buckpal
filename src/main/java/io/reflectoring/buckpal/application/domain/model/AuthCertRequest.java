package io.reflectoring.buckpal.application.domain.model;


public class AuthCertRequest {
    private final byte[] authCertRequestOer;

    public AuthCertRequest(byte[] authCertRequestOer) {
        this.authCertRequestOer = authCertRequestOer;
    }
}

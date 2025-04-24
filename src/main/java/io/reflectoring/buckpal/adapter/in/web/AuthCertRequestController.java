package io.reflectoring.buckpal.adapter.in.web;

import io.reflectoring.buckpal.application.domain.model.AuthCertRequest;
import io.reflectoring.buckpal.application.port.AuthCertRequestUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthCertRequestController {
    private final AuthCertRequestUseCase authCertRequestUseCase;

    @PostMapping("/request")
    ResponseEntity<byte[]> request(byte[] authCertRequestOer) {
        byte[] reponseOer = authCertRequestUseCase.processRequest(new AuthCertRequest(authCertRequestOer));

        return ResponseEntity.ok(reponseOer);
    }
}

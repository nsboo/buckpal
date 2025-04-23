package io.reflectoring.buckpal.adapter.in.web;

import io.reflectoring.buckpal.adapter.in.web.dto.SendMoneyDto;
import io.reflectoring.buckpal.application.port.in.SendMoneyUseCase;
import io.reflectoring.buckpal.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
class SendMoneyController {

	private final SendMoneyUseCase sendMoneyUseCase;

	@PostMapping(path = "/accounts/send")
	void sendMoney(SendMoneyDto requestDto) {
		sendMoneyUseCase.sendMoney(requestDto);
	}
}

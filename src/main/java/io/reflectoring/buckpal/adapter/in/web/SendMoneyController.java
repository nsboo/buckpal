package io.reflectoring.buckpal.adapter.in.web;

import io.reflectoring.buckpal.adapter.in.web.dto.SendMoneyRequestDto;
import io.reflectoring.buckpal.application.port.in.SendMoneyUseCase;
import io.reflectoring.buckpal.common.WebAdapter;
import io.reflectoring.buckpal.application.domain.model.Account.AccountId;
import io.reflectoring.buckpal.application.domain.model.Money;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
class SendMoneyController {

	private final SendMoneyUseCase sendMoneyUseCase;

	@PostMapping(path = "/accounts/send")
	void sendMoney(
		SendMoneyRequestDto requestDto
	) {

		sendMoneyUseCase.sendMoney(requestDto);
	}

}

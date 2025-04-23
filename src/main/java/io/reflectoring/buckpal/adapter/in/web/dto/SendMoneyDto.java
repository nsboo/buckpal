package io.reflectoring.buckpal.adapter.in.web.dto;

import io.reflectoring.buckpal.application.domain.model.Account.AccountId;
import io.reflectoring.buckpal.application.domain.model.Money;
import io.reflectoring.buckpal.application.port.in.SendMoneyInfo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SendMoneyDto implements SendMoneyInfo {
    private Long sourceAccountId;
    private Long targetAccountId;
    private Long money;

    @Override
    public AccountId sourceAccountId() {
        return new AccountId(sourceAccountId);
    }

    @Override
    public AccountId targetAccountId() {
        return new AccountId(targetAccountId);
    }

    @Override
    public Money money() {
        return Money.of(money);
    }
}

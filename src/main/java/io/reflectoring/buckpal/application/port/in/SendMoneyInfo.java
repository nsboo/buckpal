package io.reflectoring.buckpal.application.port.in;

import io.reflectoring.buckpal.application.domain.model.Account.AccountId;
import io.reflectoring.buckpal.application.domain.model.Money;

public interface SendMoneyInfo{
    AccountId sourceAccountId();
    AccountId targetAccountId();
    Money money();
}

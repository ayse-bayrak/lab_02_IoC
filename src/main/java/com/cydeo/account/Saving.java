package com.cydeo.account;

import com.cydeo.Currency;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class Saving {

    private Currency currency;
    private BigDecimal amount;
    private UUID accountId;

    public Saving(Currency currency, BigDecimal amount, UUID accountId) {
        this.currency = currency;
        this.amount = amount;
        this.accountId = accountId;
    }

    public void initialize() {
        System.out.println("savings account " + "currency: " + currency.getCode() + ", amount: " + amount + ", accountId: " + accountId);
    }
}

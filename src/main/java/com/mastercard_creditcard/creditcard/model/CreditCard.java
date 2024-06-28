package com.mastercard_creditcard.creditcard.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    private String cardHolder;
    private long cardNumber;
    private String expireDate;
    private int cvvNumber;

}

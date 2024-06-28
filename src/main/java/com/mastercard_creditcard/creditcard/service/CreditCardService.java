package com.mastercard_creditcard.creditcard.service;

import com.mastercard_creditcard.creditcard.entity.CreditCardEntity;
import com.mastercard_creditcard.creditcard.model.CreditCard;
import com.mastercard_creditcard.creditcard.repository.CreditCardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class CreditCardService {
    private final CreditCardRepository cardRepository;
    public long saveCreditCard(CreditCard card) {
        CreditCardEntity creditCardEntity =
                CreditCardEntity.builder()
                        .cardHolder(card.getCardHolder())
                        .cardNumber(card.getCardNumber())
                        .cvvNumber(card.getCvvNumber())
                        .expireDate(card.getExpireDate())
                        .build();

        creditCardEntity = cardRepository.save(creditCardEntity);
        return creditCardEntity.getId();
    }

    public List<CreditCard> getAllCreditCards() {
        List<CreditCardEntity> creditCardEntities = cardRepository.findAll();
        List<CreditCard> creditCards = new ArrayList<>();
        for (CreditCardEntity creditCardEntity : creditCardEntities) {
            CreditCard creditCard = CreditCard.builder()
                    .cardHolder(creditCardEntity.getCardHolder())
                    .cardNumber(creditCardEntity.getCardNumber())
                    .cvvNumber(creditCardEntity.getCvvNumber())
                    .expireDate(creditCardEntity.getExpireDate())
                    .build();
            creditCards.add(creditCard);
        }
        return creditCards;
    }

    public CreditCard getCreditCardById(long id) {
        CreditCardEntity creditCardEntity = cardRepository.getReferenceById(id);
        CreditCard creditCard = CreditCard.builder()
                .cardHolder(creditCardEntity.getCardHolder())
                .cardNumber(creditCardEntity.getCardNumber())
                .cvvNumber(creditCardEntity.getCvvNumber())
                .expireDate(creditCardEntity.getExpireDate())
                .build();

        return creditCard;
    }
}
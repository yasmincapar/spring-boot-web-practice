package com.mastercard_creditcard.creditcard.repository;


import com.mastercard_creditcard.creditcard.entity.CreditCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardEntity,Long> {
}

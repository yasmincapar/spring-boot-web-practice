package com.mastercard_creditcard.creditcard.controller;

import com.mastercard_creditcard.creditcard.model.CreditCard;
import com.mastercard_creditcard.creditcard.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CreditCardController {

    @Autowired
    private final CreditCardService creditCardServices;

    //Get mapping is used to handle the HTTP get request it's for retrieving resources
    //An HTTP GET request is primarily used to retrieve data from a server, which could include fetching data from a database
    //designed to retrieve data from a server
    //Testing and Debugging: Such endpoints are also useful for basic tests of your application's
    //responsiveness and functionality, ensuring that your setup correctly handles web requests.
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, world!";
    }
//
    @GetMapping("/creditcards")
    public List<CreditCard> getAllCreditCards() {
        return creditCardServices.getAllCreditCards();
    }

/*
    @GetMapping("/creditcards/{id}")
    public CreditCard getCreditCardById(@PathVariable long id) {
        CreditCard creditCard = creditCardServices.getCreditCardById(id);
        return creditCard;
    }

    @PostMapping("/creditcards")
    public long saveCreditCard(@RequestBody CreditCard card) {
        return creditCardServices.saveCreditCard(card);
    }
    */
}

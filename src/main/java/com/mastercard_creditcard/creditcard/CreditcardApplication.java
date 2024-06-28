package com.mastercard_creditcard.creditcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditcardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditcardApplication.class, args);
	}

}


//h2 database runs in memory
//it is not used for production development
//when you stop your application all data will be lost
//but is good for testing purposes
//we have the h2 dependency that we need to connect our application to h2 database
//
//From what I understand Postman can be used to GET data from the dataset
//so we create tables in the dataset then with postman we can test




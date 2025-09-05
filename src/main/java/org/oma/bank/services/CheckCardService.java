package org.oma.bank.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.oma.bank.CreditCard;

@ApplicationScoped
public class CheckCardService {

    public CreditCard get(String parameter){
        CreditCard creditCard = new CreditCard();
        creditCard.setActive(true);
        creditCard.setId(parameter);
        System.out.println(" \n ## check card");
        return creditCard;
    }
}

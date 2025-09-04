package org.oma;

import java.util.Random;


import jakarta.enterprise.context.ApplicationScoped;
import org.oma.demo.Order;

@ApplicationScoped
public class CalculationService {

    private Random random = new Random();

    public Order calculateTotal(Order order) {
        order.setTotal(random.nextDouble());

        return order;
    }
}
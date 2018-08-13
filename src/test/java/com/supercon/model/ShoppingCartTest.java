package com.supercon.model;

import com.supercon.service.OrderService;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    @Test
    public void shouldBeAbleToCalculateDiscountForDIS10Product() {
        Customer customer = new Customer("Some Customer");
        Product DIS_10_Product = new Product(100, "DIS_10_ABCD", "Some product");
        FakeOrderSerice fakeOrderService = new FakeOrderSerice();
        ShoppingCart cart = new ShoppingCart(customer,
            Collections.singletonList(DIS_10_Product),
            "Some state",
            fakeOrderService
        );

        cart.checkout();

        assertEquals(90d, fakeOrderService.totalPrice, 0.01);
    }
}

class FakeOrderSerice extends OrderService {
    double totalPrice;

    @Override
    public void showConfirmation(Customer customer, List<Product> products, double totalPrice,
        int loyaltyPointsEarned) {
        this.totalPrice = totalPrice;
    }
}
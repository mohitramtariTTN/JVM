package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    private OrderService orderServiceUnderTest;

    @Before
    public void setUp() {
        orderServiceUnderTest = new OrderService();
    }

    @Test
    public void testPlaceOrder1() {
        //Setup
        Order order = mock(Order.class);
        OrderService orderServiceMock = mock(OrderService.class);

        //Run the test
        orderServiceMock.placeOrder(order);

        //Verify
        verify(orderServiceMock).placeOrder(order);
    }

    @Test
    public void testPlaceOrder2() {
        // Setup
        final Order order = new Order(20, "Bottle", 45.0);

        // Run the test
        final boolean result = orderServiceUnderTest.placeOrder(order, "cc");

        // Verify the results
        assertEquals(true, result);
    }

    @Test
    public void testGetInstance() {
        // Run the test
        final OrderService result = OrderService.getInstance();

        // Verify the results
        assertTrue(result instanceof OrderService);
    }
}

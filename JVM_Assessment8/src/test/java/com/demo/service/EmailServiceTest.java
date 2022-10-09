package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class EmailServiceTest {

    private EmailService emailServiceUnderTest;

    @Before
    public void setUp() {
        emailServiceUnderTest = new EmailService();
    }

    @Test
    public void testSendEmail1() {
        // Setup
        final Order order = new Order(0, "itemName", 0.0);

        emailServiceUnderTest = spy(EmailService.class);

        // Run the test
        emailServiceUnderTest.sendEmail(order);

        // Verify the results
        verify(emailServiceUnderTest,times(1)).sendEmail(order);
    }

    @Test
    public void testSendEmail2() {
        // Setup
        final Order order = new Order(0, "itemName", 0.0);

        // Run the test
        final boolean result = emailServiceUnderTest.sendEmail(order, "cc");

        // Verify the results
        assertEquals(true,result);
    }

    @Test
    public void testGetInstance() {
        // Run the test
        final EmailService result = EmailService.getInstance();

        // Verify the results
        assertTrue(result instanceof EmailService);
    }
}

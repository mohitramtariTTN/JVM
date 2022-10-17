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

    @Test(expected = RuntimeException.class)
    public void testSendEmail1() {
        //Setup
        final Order order = new Order(10, "Biscuit", 10.0);

        EmailService emailServiceMock = mock(EmailService.class);
        doThrow(new RuntimeException("Exception")).
                when(emailServiceMock).sendEmail(any(Order.class));

        verify(order,times(1)).isCustomerNotified();

        //Run the test
        emailServiceMock.sendEmail(order);
    }

    @Test
    public void testSendEmail2() {
        // Setup
        final Order order = new Order(20, "Bottle", 30.0);

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

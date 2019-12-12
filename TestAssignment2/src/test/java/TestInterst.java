/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.time.Duration.ofMillis;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import mahnaz.testassignment2.Account;
import mahnaz.testassignment2.calculateYearlyInterest;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Bruger
 */
public class TestInterst {

    @Test
    public void eightDifferentAssertions() throws InterruptedException {
        calculateYearlyInterest m = new calculateYearlyInterest();

        Account account1 = new Account(700);
        Account account2 = new Account(1800);
        
        Random r = new Random();
        boolean randomBoolean = r.nextBoolean();

        assertTimeout(ofMillis(6000), () -> {
            Thread.sleep(4000);
            Object resultExample = m.Interesetcalculate(account1);
            assertAll("7 different assertions",
                    () -> assertNotNull(m.Interesetcalculate(account1)),//method should not return null
                    () -> assertTrue(resultExample.getClass().getTypeName().equals("java.lang.Double")), //the return type is double
                    () -> assertFalse(resultExample.getClass().getTypeName().equals("java.lang.Integer")), //the return type should not be integer
                    () -> assertEquals(700 * 0.05, m.Interesetcalculate(account1)),
                    () -> assertNotEquals(1800 * 0.03, m.Interesetcalculate(account2)),//interest in balance 1800 should not be minus 3%                    
                    () -> assertNotSame(account1, account2),
                    () -> assertSame(account1, account1) //the two accounts are the same
                 
            );

            assertAll("8 different assertions",
                    () -> assertEquals(true, randomBoolean),//interest in balance 700 should be 5%
                    () -> assertNotEquals(false, randomBoolean),
                    () -> assertNotNull(randomBoolean),//method should not return null
                    () -> assertNotSame(false, randomBoolean), //the two accounts are not the same
                    () -> assertSame(true, randomBoolean), //the two accounts are the same
                    () -> assertTrue(randomBoolean), //the return type is double
                    () -> assertFalse(!randomBoolean) //the return type should not be integer
            );
        }, "");

    }

}

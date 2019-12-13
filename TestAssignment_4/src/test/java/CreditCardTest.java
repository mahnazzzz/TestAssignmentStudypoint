/*
 Test account.Account.getMonthlyInterest() and creditcard.CreditCard.getDiscount() methods sufficiently
 Incorporate both a repeated test, a parameterized test and a dynamic test for the creditcard.CreditCard.getDiscount() method
 Create 4 different versions of the parameterized test, using the annotations @ValueSource, @CSVSource, @CSVFileSource and @MethodSource for the test data in each version
 Use Hamcrest matchers throughout the tests instead of JUnit asserts
 Select a part of the bank system and develop it a bit further, then set up some additional repeated tests, parameterized tests or dynamic tests for it with Hamcrest matchers
 Document how equivalence partitions, boundary values, decision tables and state transition models have been used and applied in the creation of the data-driven tests
 */

import mahnaz.testassignment_4.ATM;
import mahnaz.testassignment_4.Account;
import mahnaz.testassignment_4.Customer;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(JUnitPlatform.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@FixMethodOrder(MethodSorters.NAME_ASCENDING) //allows the user to choose the order of execution of the methods within a test class
public class CreditCardTest {

    Customer customer1;
    Customer Customer2;
    Account account1;
    Account Acount2;
    ATM atm;

    @BeforeAll
    void setUpScenarios() {
        atm = new ATM();
        account1 = new Account(600.0);
         Acount2 = new Account(2000.0);
        customer1 = new Customer("MANIA", account1);
        Customer2 = new Customer("SARA", Acount2);
       
        customer1.setCoupon(true);
        Customer2.setCoupon(true);
        
        customer1.purchaseSCustomer();
        Customer2.purchaseSCustomer();
        
        atm.deposit(500, customer1.getAcount());

    }

    @Test
    public void test1() {
       
        assertEquals(1.05, is(customer1.getAcount().Monthly_interest_rate())); //expect 5% interest rate from 500 balance
        customer1.purchaseSCustomer(); //
         double interst1 = customer1.getAcount().Monthly_interest_rate();
        customer1.getCreditCard().setCardISValid(interst1, true); // customer 1 has a coupon
        atm.deposit(550.0, account1);
        assertEquals(0.07, is(customer1.getAcount().Monthly_interest_rate()));
        customer1.getCreditCard().setCardISValid(interst1, true);
    }
    
    /* @org.junit.jupiter.api.Test
    @RepeatedTest(3) // To create repeatable test template method, a
    public void test2(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        if (testInfo.getDisplayName().contains("repet 1 ")) {
            assertThat(30, is(customer1.getCreditCard().getDiscount()));
        }
        else if (testInfo.getDisplayName().contains("repet 2")) {
            assertThat(10, is(Customer2.getCreditCard().getDiscount())); //goes from 15 to 10 because david is not a new user anymore...
        }
        else if (testInfo.getDisplayName().contains("repet 3")) {
            assertThat(15, is(Customer2.getCreditCard().getDiscount()));
           
            
        }

    } */
   

}

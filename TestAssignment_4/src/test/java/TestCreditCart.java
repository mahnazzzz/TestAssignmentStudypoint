
import mahnaz.testassignment_4.ATM;
import mahnaz.testassignment_4.CreditCard;
import mahnaz.testassignment_4.Customer;
import mahnaz.testassignment_4.Account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.FixMethodOrder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Bruger
 */
@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCreditCart {

    ATM atm;
    Customer c1;
    CreditCard cc1;
    Account a1;
    Customer c2;
    CreditCard cc2;
    Account a2;

    @BeforeAll
    public void beforeall() {
        atm = new ATM();

        a1 = new Account(1001.0, 1);
        cc1 = new CreditCard(a1, 0.0, true);

        c2 = new Customer(2, "Customer1", cc1, true);
        a2 = new Account(50.0, 2);
        cc2 = new CreditCard(a2, 0.0, true);
        c1 = new Customer(1, "Customer1", cc1, true);

    }

    @Test
    void test1() {
        assertThat(0.07, is(atm.Monthly_interest_rate(a1)));
        System.out.println(" THIS IS :  " + a1.getBalance());

        atm.withdraw(500, a1);
        System.out.println("THIS IS :  " + a1.getBalance());
        assertThat(0.05, is(atm.Monthly_interest_rate(a1)));

        atm.Purchase_with_discount(c1, true);
        System.out.println("THIS IS :  " + cc1.getDiscount());
        assertThat(0.20, is(cc1.getDiscount()));

        atm.Purchase_with_discount(c1, false);
        System.out.println("THIS IS :  " + cc1.getDiscount());
        assertThat(0.10, is(cc1.getDiscount()));

        c1.getCreditCart().setCardISValid(false);
        atm.Purchase_with_discount(c1, false);
        assertThat(0.15, is(cc1.getDiscount()));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void test2(String input, String expected) {
        double number = Double.parseDouble(expected);
        System.out.println("THIS IS CSV number:  " + number);
        if (number == 0.15) {
            assertThat(number, is(cc1.getDiscount()));
        }
        if (number == 0.10) {
            assertThat(number, is(cc1.getDiscount()));
        }

    }
 private static Stream<Arguments> iSBlank() {
        return Stream.of(
                Arguments.of("c1",0.0),
                Arguments.of("c2",0.0)
        );
    }
  public double isDiscount(String customerName) {
        if (customerName.matches(c1.getName())) {
            System.out.println("name is :" + c1.getName());
            return c1.getCreditCart().getDiscount();
        }
        if (customerName.matches(c2.getName())) {
            return c2.getCreditCart().getDiscount();
        } return 0.0;
    }
    @ParameterizedTest
    @MethodSource("iSBlank")
    void test3(String input, double expected) {
        double discount = isDiscount(input);
        System.out.println("discount is... " + discount);
        assertThat(expected, is(discount));
    }
}

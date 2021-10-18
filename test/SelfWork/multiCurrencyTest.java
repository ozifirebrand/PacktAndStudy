package SelfWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class multiCurrencyTest {
    /* TODO: 10/10/2021  add amounts in  two currencies and convert the result to a set of exchange rates.
    todo -> To multiply an amount by a number of shares and receive an amount
     */
    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}

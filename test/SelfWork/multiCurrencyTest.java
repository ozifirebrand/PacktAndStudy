package SelfWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void testMultiplication_(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product= five.times(3);
        assertEquals(15, product.amount);
    }
    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }
}

package SelfWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HackathonJulyTest {
    @Test
    public void testTwoSumMethod() {

        Assertions.assertEquals("[0, 1]", Arrays.toString(
                HackathonJuly.argsMethod(67, 34, 33, 35, 3)));
    }
}
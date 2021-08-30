package SelfWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HackathonJulyTest {
    @Test
    public void testTwoSumMethod() {
        //given
        HackathonJuly.argsMethod(67, 54,33,34,33);

        Assertions.assertEquals("[2, 3]", Arrays.toString(HackathonJuly.argsMethod(67, 54, 33, 34, 33)));
    }
}
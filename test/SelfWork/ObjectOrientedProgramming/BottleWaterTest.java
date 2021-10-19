package SelfWork.ObjectOrientedProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottleWaterTest {

    @Test
    public void test_thereIsWater(){
        //given == precondition
        /*There is pot, food, gas, person,
        // when
         */
//        Room, Person, Broom.
        BottleWater bottleWater = new BottleWater();
        assertNotNull(bottleWater.getWater());
    }

}
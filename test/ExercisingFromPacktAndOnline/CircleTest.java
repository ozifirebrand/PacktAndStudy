package ExercisingFromPacktAndOnline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test

    public void testThatRadiusCanBeGotten(){
      Circle circle = new Circle();
      circle.findRadius(6);
      assertEquals(6, circle.getRadius());

    }

    @Test
    public void testThatDiameterCanBeGotten(){
        Circle circle =  new Circle();
        circle.findRadius(6);
        circle.findDiameter();
        assertEquals(12, circle.getDiameter());
    }

    @Test
    public void testThatAreaCanBeFound(){
        Circle circle = new Circle();
        circle.findRadius(6);
        circle.findArea();
        assertEquals(113.03999999999999, circle.getArea());
    }

    @Test
    public void testThatCircumferenceCanBeFound(){
        Circle circle = new Circle();
        circle.findRadius(6);
        circle.findCircumference();
        Assertions.assertEquals(37.68, circle.getCircumference());
    }


}
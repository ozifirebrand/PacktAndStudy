package Simpletron;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpletronTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void canCreateInstanceOfSimpletron(){
        Simpletron simpletron = new Simpletron();
        Word word = new Word("0028");
        simpletron.readInstruction(word);
    }

    @Test
    void thatSimpletronHasAccumulator(){
        Simpletron simpletron = new Simpletron();
        Byte accumulator = simpletron.getAccumulator();
        assertNotNull(accumulator);
    }
}
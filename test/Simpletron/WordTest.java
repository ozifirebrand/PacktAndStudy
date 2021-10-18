package Simpletron;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    void createInstance(){
        Word word = new Word("0024");
    }

    @Test
    void thatCanGetData(){
        Word word = new Word("0024");
        assertEquals("00", word.getInstruction());
    }

    @Test
    void thatCanGetInstruction(){
        Word word = new Word("0024");
        assertEquals("24", word.getData());
    }
}
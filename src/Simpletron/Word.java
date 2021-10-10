package Simpletron;

public class Word {
    private final String instruction;
    private final String data;

    public Word(String input) {
        this.instruction = input.substring(0,2);
        this.data = input.substring(2);
    }

    public String getInstruction() {
        return instruction;
    }

    public String getData() {
        return data;
    }
}

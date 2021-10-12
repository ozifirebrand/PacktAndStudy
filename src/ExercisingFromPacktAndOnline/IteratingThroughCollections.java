package ExercisingFromPacktAndOnline;

import java.io.Console;
import java.util.*;
public class IteratingThroughCollections {
    public static void main(String[] args) {
        Console console;
        String line = "";
        if ( (console=System.console()) != null && (line = console.readLine()) != null)
            System.out.println("You typed: " +line);
    }
}
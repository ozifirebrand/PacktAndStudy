import java.util.Arrays;

public class WordTool {
        WordTool(){}

        public int wordCount(String s){
            int count = 0;
            if ( !(s ==null || s.isEmpty()) ){
                String[] w = s.split("\\s+");
                count = w.length;
            }
            return count;
        }
        public int symbolCount(String s, boolean withSpaces){
            int count =0;
            if ( !(s == null || s.isEmpty()) ){
                if ( withSpaces ){
                    count= s.length();
                }else {
                    count= s.replace(" ", "").length();
                }
            }
            return count;
        }

        public int frequencyOfACharacter(String input, char characterInString){
            int frequencyOfCharacterInSentence = 0;
            String [] separatedSentence = input.split("\\s");
            for (String word : separatedSentence) {
                char[] characters = word.toCharArray();
                for (char character : characters) {
                    if ( character == characterInString )
                        frequencyOfCharacterInSentence++;
                }
            }
            return frequencyOfCharacterInSentence;
        }

        public static void main(String[] args) {
            WordTool wt = new WordTool();
            String text = "The river carried the memories from her childhood. ";
            System.out.println("Analyzing the text: \n" +text);
            System.out.println("Total words: " +wt.wordCount(text));
            System.out.println("Total symbols (w.spaces): " +wt.symbolCount(text, true));
            System.out.println("Total symbols (wo.spaces): " +wt.symbolCount(text, false));
            System.out.println("The frequency of e: " +wt.frequencyOfACharacter(text, 'e'));
        }
}
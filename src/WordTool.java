import java.util.Arrays;

public class WordTool {
        public WordTool(){}

        public int wordCount(String s){
            int count = 0;
            if ( !(s ==null || s.isEmpty()) ){
                String[] word = s.split("\\s+");
                count = word.length;
            }
            return count;
        }
        public int symbolCount(String sentence, boolean withSpaces){
            int count =0;
            if ( !(sentence == null || sentence.isEmpty()) ){
                if ( withSpaces ){
                    count= sentence.length();
                }else {
                    count= sentence.replace(" ", "").length();
                }
            }
            return count;
        }

        public int frequencyOfACharacter(String sentenceInput, char characterInString){
            int frequencyOfCharacterInSentence = 0;
            String [] separatedSentence = sentenceInput.split("\\s");
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
            WordTool wordTool = new WordTool();
            String text = "The river carried the memories from her childhood. ";
            System.out.println("Analyzing the text: \n" +text);
            System.out.println("Total words: " +wordTool.wordCount(text));
            System.out.println("Total symbols (w.spaces): " +wordTool.symbolCount(text, true));
            System.out.println("Total symbols (wo.spaces): " +wordTool.symbolCount(text, false));
            System.out.println("The frequency of e: " +wordTool.frequencyOfACharacter(text, 'e'));
        }
}
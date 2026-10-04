import java.util.ArrayList;
import java.util.List;

class Tester {
    
    static int count = 0;
    
    public static void findWordSegments(List<String> wordsList, String inputString) {
        
        count = 0;
        findSegments(wordsList, inputString, 0);
    }
    
    public static void findSegments(List<String> wordsList, String inputString, int start) {
        
        // If the complete string has been formed
        if (start == inputString.length()) {
            count++;
            return;
        }
        
        // Try every word from the given list
        for (String word : wordsList) {
            
            if (inputString.startsWith(word, start)) {
                findSegments(wordsList, inputString, start + word.length());
            }
        }
    }

    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<String>();
        
        wordsList.add("i");
        wordsList.add("like");
        wordsList.add("pizza");
        wordsList.add("li");
        wordsList.add("ke");
        wordsList.add("pi");
        wordsList.add("zza");

        String inputString = "ilikepizza";
        
        findWordSegments(wordsList, inputString);
        
        System.out.println("Number of segments: " + count);
    }
}
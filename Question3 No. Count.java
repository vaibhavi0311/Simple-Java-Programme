import java.util.HashMap;

public class Question3 {
    
    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        for (String word : words) {
            word = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");
            
            word = word.toLowerCase();
            
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap.size();
    }
    
    public static void main(String[] args) {
        String inputString = "Hello, how are you? This is a test string. Test, test, test!";
        int wordCount = countWords(inputString);
        System.out.println("Number of words in the string: " + wordCount);
    }
}

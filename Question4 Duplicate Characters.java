import java.util.HashMap;

public class Question4 {
    
    // Function to find duplicate characters in a string
    public static void findDuplicates(String str) {
        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to lowercase for case-insensitive counting
        str = str.toLowerCase();
        
        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Increment the count for the current character in the HashMap
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        // Print duplicate characters and their frequencies
        System.out.println("Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + ": " + charCountMap.get(ch));
            }
        }
    }
    
    // Main logic
    public static void main(String[] args) {
        String inputString = "Programming";
        findDuplicates(inputString);
    }
}

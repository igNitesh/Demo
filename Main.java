/**
 * Main entry point for the Demo project.
 * Demonstrates basic string manipulation operations in Java.
 */
public class Main {
    
    public static void main(String[] args) {
        // Demonstrate string creation and manipulation
        String originalString = new String("hello");
        String secondString = "worlfjjeefhhkhd";
        
        // Replace 'e' with 'a' in the original string
        String modifiedString = originalString.replace('e', 'a');
        System.out.println("Modified string: " + modifiedString);
        
        // Extract substring from index 2 to 6
        String substring = secondString.substring(2, 6);
        System.out.println("Substring: " + substring);
    }
}

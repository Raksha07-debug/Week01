import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter a string
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        
        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < s1.length(); i++) {
            // Check if the character is a vowel
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        // Print the number of vowels and consonants
        System.out.println("Number of vowels in the string: " + vowelCount + ", Number of consonants in the string: " + consonantCount);
    }
}

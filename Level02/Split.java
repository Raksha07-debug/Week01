
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        scanner.close();

        String[] wordsUsingSplit = text.split("\\s+");
        String[] wordsUsingCustomMethod = splitTextIntoWords(text);

        boolean areEqual = compareArrays(wordsUsingSplit, wordsUsingCustomMethod);

        System.out.println("Words using split() method:");
        printArray(wordsUsingSplit);
        System.out.println("Words using custom method:");
        printArray(wordsUsingCustomMethod);
        System.out.println("Are the two arrays equal? " + areEqual);
    }

    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[] splitTextIntoWords(String text) {
        int length = findLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        int startIndex = 0;
        for (int i = 0; i < spaceCount; i++) {
            words[wordIndex++] = text.substring(startIndex, spaceIndexes[i]);
            startIndex = spaceIndexes[i] + 1;
        }
        words[wordIndex] = text.substring(startIndex, length);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}

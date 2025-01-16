import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();

        char[] userDefinedArray = stringToCharArray(str);
        char[] builtInArray = str.toCharArray();

        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);

        System.out.println("User-defined method array: " + new String(userDefinedArray));
        System.out.println("Built-in method array: " + new String(builtInArray));
        System.out.println("Both arrays are equal: " + areEqual);
    }

    public static char[] stringToCharArray(String str) {
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        


        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}

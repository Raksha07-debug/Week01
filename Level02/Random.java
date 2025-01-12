public class Random {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        
        // Read the size of the array from the user
        int size = scanner.nextInt();
        
        // Create an instance of the Random class
        Random obj = new Random();
        
        // Generate a random array with 4-digit numbers
        int[] numbers = obj.generate4DigitRandomArray(size);
        
        // Find the average, minimum, and maximum values of the array
        double[] result = obj.findAverageMinMax(numbers);
        
        // Print the average, minimum, and maximum values
        System.out.println("Average: " + result[0]);
        System.out.println("Min: " + result[1]);
        System.out.println("Max: " + result[2]);
    }

    // Method to generate an array with random 4-digit numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number and assign it to the array
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        double min = numbers[0];
        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            // Calculate the sum of the array elements
            sum += numbers[i];
            
            // Update the minimum value if the current element is smaller
            if (numbers[i] < min) {
                min = numbers[i];
            }
            
            // Update the maximum value if the current element is larger
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Calculate the average value of the array
        double average = sum / numbers.length;
        
        // Return the average, minimum, and maximum values as an array
        return new double[] { average, min, max };
    }
}

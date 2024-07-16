public class LoopAssignValues {
    public static void main(String[] args) {
        // Integer array with length 5
        int[] array = new int[5];

        // Loop to assign values
        for (int i = 0; i < array.length; i++) {
            array[i] = i; // Assigning value of loop control variable i to array index
        }

        // Print the array
        System.out.println("Array elements:");
        for (int value : array) {
            System.out.println(value);
        }
    }
}
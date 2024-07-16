public class MixedDataTypeArray {
    public static void main(String[] args) {
        // Array with integer, strings, and double
        Object[] mixedArray = {10, "Hello", "World", "Java", 3.14};

        // Print the array
        System.out.println("Mixed data type array:");
        for (Object element : mixedArray) {
            System.out.println(element);
        }
    }
}
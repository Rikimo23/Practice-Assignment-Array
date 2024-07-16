import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] numbers = {4, 2, 9, 13, 1, 0};


        Arrays.sort(numbers);


        System.out.println("Array in ascending order: " + Arrays.toString(numbers));


        System.out.println("The smallest number is " + numbers[0]);
        System.out.println("The biggest number is " + numbers[numbers.length - 1]);
    }
}
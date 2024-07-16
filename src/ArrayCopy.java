import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        String[] colors = {"red", "green", "blue", "yellow"};


        System.out.println("Original array length: " + colors.length);


        String[] copiedColors = colors.clone();


        System.out.println("Copied array: " + Arrays.toString(copiedColors));
    }
}
public class LoopPrintExceptMiddle {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};


        for (int i = 0; i < array.length; i++) {
            if (i != array.length / 2) {
                System.out.println("Element at index " + i + ": " + array[i]);
            }
        }
    }
}
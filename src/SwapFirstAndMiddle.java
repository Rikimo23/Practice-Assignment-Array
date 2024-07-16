public class SwapFirstAndMiddle {
    public static void main(String[] args) {

        String[] colors = {"red", "green", "blue", "yellow", "orange"};


        String temp = colors[0];
        colors[0] = colors[colors.length / 2];
        colors[colors.length / 2] = temp;


        System.out.println("Array after swapping:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

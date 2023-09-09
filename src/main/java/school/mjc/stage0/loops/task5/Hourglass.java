package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        // Print the top half of the hourglass
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (height - i) - 1; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        // Print the bottom half of the hourglass
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (height - i) - 1; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        int height = 4; // Change this to adjust the size of the hourglass
        hourglass.printHourglassOfGivenSize(height);
    }
}


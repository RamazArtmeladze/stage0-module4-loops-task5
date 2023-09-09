package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print '8' characters
            for (int k = 0; k < 2 * (height - i) - 1; k++) {
                System.out.print("8");
            }

            System.out.println();
        }

        for (int i = height - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print '8' characters
            for (int k = 0; k < 2 * (height - i) - 1; k++) {
                System.out.print("8");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(5); // Replace 5 with your desired height
    }
}



import java.util.Scanner;

    public class LineComparison {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input for first line
            System.out.println("Enter coordinates for first line:");
            System.out.print("x1: ");
            int x1 = scanner.nextInt();
            System.out.print("y1: ");
            int y1 = scanner.nextInt();
            System.out.print("x2: ");
            int x2 = scanner.nextInt();
            System.out.print("y2: ");
            int y2 = scanner.nextInt();

            // Calculate length of first line
            double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            // Input for second line
            System.out.println("Enter coordinates for second line:");
            System.out.print("x1: ");
            int a1 = scanner.nextInt();
            System.out.print("y1: ");
            int b1 = scanner.nextInt();
            System.out.print("x2: ");
            int a2 = scanner.nextInt();
            System.out.print("y2: ");
            int b2 = scanner.nextInt();

            // Calculate length of second line
            double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));

            // Compare lengths
            if (length1 == length2) {
                System.out.println("Both lines are equal in length.");
            } else if (length1 > length2) {
                System.out.println("First line is longer than the second line.");
            } else {
                System.out.println("Second line is longer than the first line.");
            }

            scanner.close();
        }
    }



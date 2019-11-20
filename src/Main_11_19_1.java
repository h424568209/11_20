import java.util.Scanner;

public class Main_11_19_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int cols = scanner.nextInt();
            String c = scanner.next();
            int rows = cols / 2;
            if (cols % 2 != 0) {
                rows = cols / 2 + 1;
            }
            for (int i = 0; i < cols; i++) {
                System.out.print(c);
            }
            System.out.println();
            for (int i = 0; i < rows - 2; i++) {
                System.out.print(c);
                for (int j = 0; j < cols - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(c);
                System.out.println();
            }
            for (int i = 0; i < cols; i++) {
                System.out.print(c);
            }
            System.out.println();
        }

        }
    }


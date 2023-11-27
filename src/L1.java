import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int numb: ");
        boolean numb = iScanner.hasNextInt();
        if (numb == true) {
            int n = iScanner.nextInt();
            System.out.println(n + 1);
        } else {
            System.out.println("Enter number");

        }
    }
}

import java.util.Scanner;

public class NumberPattern {

    static void pattern(int x) {

        if (x <= 0) {
            System.out.print(x + " ");
            return;
        }
        System.out.print(x + " ");
        pattern(x - 5);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int n = inp.nextInt();

        pattern(n);

    }
}

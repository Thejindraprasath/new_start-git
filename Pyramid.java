import java.util.Scanner;

public class Pyramid {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        in.close();
    }
}

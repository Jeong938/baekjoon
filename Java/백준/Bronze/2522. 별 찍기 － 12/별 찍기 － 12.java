import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 2 * N - 1; i++) {
            for (int j = 0; j < (i <= N ? N - i : i - N); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i <= N ? i : 2 * N - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

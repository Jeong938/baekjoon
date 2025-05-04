import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] C = {
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
        };

        long[] N = {
            1L, 10L, 100L, 1000L, 10000L,100000L,
            1000000L, 10000000L, 100000000L, 1000000000L
        };

        int A1 = 0, A2 = 0, A3 = 0;

        // 입력
        String c1 = sc.nextLine().trim();
        String c2 = sc.nextLine().trim();
        String c3 = sc.nextLine().trim();

        for (int i = 0; i < 10; i++) {
            if (C[i].equals(c1)) A1 = i;
            if (C[i].equals(c2)) A2 = i;
            if (C[i].equals(c3)) A3 = i;
        }

        long result = (A1 * 10L + A2) * N[A3];
        System.out.println(result);
    }
}
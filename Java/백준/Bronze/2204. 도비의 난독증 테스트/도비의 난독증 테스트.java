import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) break;

            String r = null;

            for (int i = 0; i < n; i++) {
                String w = sc.nextLine();
                if (r == null || w.compareToIgnoreCase(r) < 0) {
                    r = w;
                }
            }

            System.out.println(r);
        }

    }
}
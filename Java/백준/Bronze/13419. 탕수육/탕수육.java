import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < T; t++) {
            String s = sc.nextLine();
            int l = s.length();

            // 먼저 시작한 사람
            boolean[] v = new boolean[l];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; !v[i % l]; i += 2) {
                int idx = i % l;
                sb.append(s.charAt(idx));
                v[idx] = true;
            }
            System.out.println(sb.toString());

            // 나중에 시작한 사람
            v = new boolean[l];
            sb = new StringBuilder();
            for (int i = 1; !v[i % l]; i += 2) {
                int idx = i % l;
                sb.append(s.charAt(idx));
                v[idx] = true;
            }
            System.out.println(sb.toString());
        }
    }
}

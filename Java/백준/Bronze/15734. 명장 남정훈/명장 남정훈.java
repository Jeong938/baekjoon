import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); // 왼발잡이
        int R = sc.nextInt(); // 오른발잡이
        int A = sc.nextInt(); // 양발잡이

        int diff;
        if (L > R) {
            diff = L - R;
        } else {
            diff = R - L;
        }

        if (A >= diff) {
            if (L > R) {
                R += diff;
            } else {
                L += diff;
            }
            A -= diff;

            // A를 절반씩 나눠서 왼쪽과 오른쪽에 더함 (짝수 단위로만 추가 가능)
            int pair = A / 2;
            L += pair;
            R += pair;
        } else {
            // A로 차이 못 맞추는 경우: 작은 쪽에 A만큼만 더함
            if (L > R) {
                R += A;
            } else {
                L += A;
            }
        }

        // 최종 남은 인원 수는 양쪽 중 작은 수 × 2
        int result;
        if (L < R) {
            result = L * 2;
        } else {
            result = R * 2;
        }

        System.out.println(result);
    }
}

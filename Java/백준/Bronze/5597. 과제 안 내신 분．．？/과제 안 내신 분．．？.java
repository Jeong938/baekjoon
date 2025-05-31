import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] submitted = new boolean[31]; // 인덱스 1~30 사용

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            submitted[num] = true; // 제출한 학생은 true 표시
        }

        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i); // 제출하지 않은 학생 출력
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받는 스캐너

        while (true) {
            String s = sc.nextLine(); // 숫자 문자열 입력

            if (s.equals("0")) {
                break; // 0이면 종료
            }

            int w = 2; // 좌우 여백 1cm씩, 총 2cm

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i); // 현재 자리 숫자

                if (c == '1') {
                    w += 2;
                } else if (c == '0') {
                    w += 4;
                } else {
                    w += 3;
                }

                if (i < s.length() - 1) {
                    w += 1; // 숫자 사이 여백
                }
            }

            System.out.println(w); // 총 너비 출력
        }
    }
}

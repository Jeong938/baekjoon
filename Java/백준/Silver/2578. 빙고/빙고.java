import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] bd = new int[5][5];         // bd: 철수의 빙고판
        int[][] call = new int[5][5];       // call: 사회자가 부른 숫자 순서
        boolean[][] chk = new boolean[5][5]; // chk: 불린 숫자 표시

        Map<Integer, int[]> pos = new HashMap<>(); // pos: 숫자의 위치를 저장하는 맵

        // 빙고판 입력 받기
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                bd[r][c] = sc.nextInt();
                pos.put(bd[r][c], new int[]{r, c}); // 숫자의 위치 저장
            }
        }

        // 사회자가 부른 숫자 입력 받기
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                call[r][c] = sc.nextInt();
            }
        }

        int cnt = 0; // cnt: 사회자가 지금까지 부른 숫자의 개수

        // 숫자를 하나씩 부르면서 처리
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                cnt++;
                int num = call[r][c];         // 현재 부른 숫자
                int[] p = pos.get(num);       // 숫자의 위치 찾기
                chk[p[0]][p[1]] = true;       // 해당 위치 체크

                if (bingo(chk) >= 3) {        // 빙고 줄이 3개 이상이면
                    System.out.println(cnt); // 현재 호출 수 출력
                    return;
                }
            }
        }
    }

    // 빙고 줄 개수를 세는 함수
    public static int bingo(boolean[][] chk) {
        int b = 0; // b: 완성된 빙고 줄 개수

        // 가로 줄 체크
        for (int r = 0; r < 5; r++) {
            boolean ok = true;
            for (int c = 0; c < 5; c++) {
                if (!chk[r][c]) {
                    ok = false;
                    break;
                }
            }
            if (ok) b++;
        }

        // 세로 줄 체크
        for (int c = 0; c < 5; c++) {
            boolean ok = true;
            for (int r = 0; r < 5; r++) {
                if (!chk[r][c]) {
                    ok = false;
                    break;
                }
            }
            if (ok) b++;
        }

        // 왼쪽 위 ↘ 오른쪽 아래 대각선 체크
        boolean ok = true;
        for (int i = 0; i < 5; i++) {
            if (!chk[i][i]) {
                ok = false;
                break;
            }
        }
        if (ok) b++;

        // 오른쪽 위 ↙ 왼쪽 아래 대각선 체크
        ok = true;
        for (int i = 0; i < 5; i++) {
            if (!chk[i][4 - i]) {
                ok = false;
                break;
            }
        }
        if (ok) b++;

        return b; // 총 빙고 줄 개수 반환
    }
}

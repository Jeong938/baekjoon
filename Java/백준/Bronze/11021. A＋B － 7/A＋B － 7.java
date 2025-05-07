import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter를 사용하여 입출력을 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 번째 입력은 테스트 케이스의 수
        int T = Integer.parseInt(br.readLine());
        
        // 각 테스트 케이스마다 A와 B를 입력받고 그 합을 출력
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            bw.write("Case #"+(i+1)+": "+(A + B) + "\n");
        }
        
        // BufferedWriter의 flush를 통해 출력이 실제로 이루어지도록 함
        bw.flush();
        
        // BufferedReader와 BufferedWriter를 닫음
        br.close();
        bw.close();
    }
}

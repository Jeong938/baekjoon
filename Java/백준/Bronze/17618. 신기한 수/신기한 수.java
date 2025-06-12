import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        int cnt = 0;
        for (int i = 1; i <= N; i++){
            if(i%10==0){
                res = 0;
                for (int j = 0; j < (i+"").length(); j++) {
                    res+= Integer.parseInt((i+"").charAt(j)+"");
                }
            }
            else{
                res++;
            }

            if(i%res == 0)
                cnt++;
        }

        System.out.println(cnt);

    }
}
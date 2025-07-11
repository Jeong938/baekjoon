import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		long res = 0;
		int temp = 2;
		for(int i = 0; i < n; i++) {
			res += temp;
			temp+= 3;
		}
		res += 1 + n*2;
		System.out.println(res%45678);
	}
}

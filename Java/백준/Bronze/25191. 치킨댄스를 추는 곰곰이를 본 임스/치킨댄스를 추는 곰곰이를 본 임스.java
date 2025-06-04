import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		if(A/2+B<N) {
			System.out.println(A/2+B);
		}else {
			System.out.println(N);
		}
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		if(M<=N*100) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

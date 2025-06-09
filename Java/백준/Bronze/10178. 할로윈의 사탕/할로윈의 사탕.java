import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int temp=a;
			a=a/b;
			b=temp%b;
			System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n",a,b);
		}
	}

}

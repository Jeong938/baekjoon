import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int S=sc.nextInt();
			int sum=0;
			for(int j=1;j<=S;j++) {
				sum+=j*((j+1)*(j+2))/2;
			}
			System.out.println(sum);
		}
	}

}

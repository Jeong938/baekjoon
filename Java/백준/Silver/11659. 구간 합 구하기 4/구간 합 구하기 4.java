import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] A=new int[N];
		int[] P=new int[N+1];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		};
		
		for(int i=1;i<=N;i++) {
			P[i]=P[i-1]+A[i-1];
			}
		
		for(int i=0;i<M;i++) {
			int r1=sc.nextInt();
			int r2=sc.nextInt();
			
			System.out.println(P[r2]-P[r1-1]);
		}
		
		
		
	}

}
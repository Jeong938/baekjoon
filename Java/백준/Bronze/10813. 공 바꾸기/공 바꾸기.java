import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int[] c=new int[N];
		for(int i=0;i<N;i++) {
			c[i]=i+1;
		}
		for(int i=0;i<M;i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			int result;
			result=c[a];
			c[a]=c[b];
			c[b]=result;
		}
		
		for(int i=0;i<N;i++) {
			System.out.printf("%d ",c[i]);
		}
		
	}

}

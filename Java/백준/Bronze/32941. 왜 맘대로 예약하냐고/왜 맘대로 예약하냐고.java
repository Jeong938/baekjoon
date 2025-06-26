import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int[] C=new int[T];
		int X=sc.nextInt()-1;
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			int n=sc.nextInt();
			for(int j=0;j<n;j++) {
				int k=sc.nextInt()-1;
				C[k]+=1;
			}
		}
		if(C[X]==N) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}

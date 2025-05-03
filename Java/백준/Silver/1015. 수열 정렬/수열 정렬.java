import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[][] A=new int[N][2];
		for(int i=0;i<N;i++) {
			A[i][0]=sc.nextInt();
			A[i][1]=i;
		}
		Arrays.sort(A, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		        return Integer.compare(a[0], b[0]);
		    }
		});
		int[] P=new int[N];
		for(int i=0;i<N;i++) {
			P[A[i][1]]=i;
		}
		
		for(int i=0;i<N;i++) {
			System.out.printf("%d ",P[i]);
		}
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] array=new int[N];
		int max=0;
		for(int i=0;i<N;i++) {
			array[i]=sc.nextInt();
			if(array[i]>max) {
				max=array[i];
			}
		}
		double P=0.0;
		
		for(int i=0;i<N;i++) {
				P+=(double)array[i]/max*100;		
		}
		
		System.out.println(P/N);
		
	}

}
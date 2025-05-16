import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		
		int[] Nl=new int[N];
		for(int i=0; i<N; i++) {
			Nl[i]=sc.nextInt();
		}
		for(int i=0; i<Nl.length;i++) {
			if(Nl[i]<X) {
				System.out.printf("%d ",Nl[i]);
			}
		}
		
	}

}
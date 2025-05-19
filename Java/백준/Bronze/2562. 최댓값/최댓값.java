import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] N=new int[9];
		for(int i=0; i<N.length;i++) {
			N[i]=sc.nextInt();
		}
		int max=0;
		int index=0;
		for(int i=0; i<N.length;i++) {
			if(N[i]>=max) {
				max=N[i];
				index=i+1;
			}
		}
		
		System.out.printf("%d\n%d",max,index);
	}

}

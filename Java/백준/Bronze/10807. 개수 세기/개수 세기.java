import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] N=new int[n];
		
		for(int i=0;i<n;i++) {
			N[i]=sc.nextInt();
		}
		int v=sc.nextInt();
		int s=0;
		for(int i=0;i<n;i++) {
			if(N[i]==v) {
				s+=1;
			}
		}
		System.out.println(s);
	}

}
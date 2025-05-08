import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] N=new int[5];
		for(int i=0;i<5;i++) {
			N[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.printf("%d ",N[i]-a*b);
		}
	}

}
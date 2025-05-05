import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ie=1;
		int[] N=new int[1001];
		for(int i=1;i<1000;i++) {
			for(int j=0;j<i&&ie<=1000;j++) {
				N[ie]=i;
				ie++;
			}
		}
		
		int s=0;
		for(int i=a;i<=b;i++) {
			s+=N[i];
		}
		System.out.println(s);
	}

}
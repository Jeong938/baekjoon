import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a1,a2,a3;
		a1=sc.nextInt();
		a2=sc.nextInt();
		a3=sc.nextInt();
		
		int c1,c2,c3;
		c1=sc.nextInt();
		c2=sc.nextInt();
		c3=sc.nextInt();
		
		System.out.printf("%d %d %d",c1-a3,c2/a2,c3-a1);
	}

}
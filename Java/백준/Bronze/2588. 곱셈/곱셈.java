import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int N3=N1*(N2%10);
		int N4=N1*((N2/10)%10);
		int N5=N1*(N2/100);
		int N6= N3+(N4*10)+(N5*100);
		
		System.out.println(N3);
		System.out.println(N4);
		System.out.println(N5);
		System.out.println(N6);
	}

}
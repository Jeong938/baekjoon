import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		int i=sc.nextInt();
		
		S=S.substring(i-1,i);
		System.out.println(S);
	}

}

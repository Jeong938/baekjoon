import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] in=new String[n];
		
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+". "+sc.nextLine());
		}
		
	}


}
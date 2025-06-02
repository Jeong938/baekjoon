import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long M=sc.nextLong();
		
		long sum=0;
		
		for(int i=0;i<N;i++) {
			sum+=sc.nextLong()-1;
		}
		
		if(M<=sum) {
			System.out.println("DIMI");
		}else {
			System.out.println("OUT");
		}
		
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int M=sc.nextInt();
		int N=sc.nextInt();
		
		H+=N/60;
		M+=N%60;
		if(M>59) {
			H+=M/60;
			M=M%60;
		}
		if(H>23) {
			H=H%24;
		}
		System.out.printf("%d %d",H,M);
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		for(int i=1; i<10;i++) {
			System.out.printf("%d * %d = %d\n",N,i,i*N);
		}
	}

}

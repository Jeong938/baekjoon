import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int s=0;
		for(int i=0;i<3;i++) {
			int A=sc.nextInt();
			if(A<N) {
				s+=A;
			}else {
				s+=N;
			}
		}
		System.out.println(s);
		
		

	}

}
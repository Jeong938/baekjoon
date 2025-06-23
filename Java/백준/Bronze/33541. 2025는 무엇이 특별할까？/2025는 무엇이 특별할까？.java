import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int b=1;
		for(int y=N+1;y<=9999;y++) {
			int y1=y/100;
			int y2=y%100;
			int sum=y1+y2;
			if(sum*sum==y) {
				System.out.println(y);
				b=0;
				return;
			}
		}
		
		
			if(b==1) {
				System.out.println(-1);
			}
		
			
		
		
	}

}

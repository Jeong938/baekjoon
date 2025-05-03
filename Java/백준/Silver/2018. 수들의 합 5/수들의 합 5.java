import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int c=0;
		for(int i=1;i<=N;i++) {
			int a=i;
			int b=0;
			while(a<=N) {
				b+=a++;
				if(b>N) {
					break;
				}
				else if(b==N) {
					c+=1;
				}
			}	
		}
		System.out.println(c);
	}

}
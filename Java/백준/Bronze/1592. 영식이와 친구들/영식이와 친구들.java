import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int L=sc.nextInt();
		
		int[] count=new int[N];
		int s=0;
		int b=0;
		while(true) {
			count[s]++;
			if(count[s]==M) {
				break;
			}
			if(count[s]%2==1) {
				s=(s+L)%N;
			}else {
				s=(s-L+N)%N;
			}
			b++;
			
		}
		System.out.println(b);
	}

}
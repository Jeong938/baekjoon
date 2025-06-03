import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] N= {3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1};
		String[] C= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		String[] S=sc.next().split("");
		int sum=0;
		for(int i=0;i<S.length;i++) {
			for(int j=0;j<N.length;j++) {
				if(S[i].equals(C[j])) {
					sum+=N[j];
				}
				if(sum>10) {
					sum%=10;
				}
			}
		}
		if(sum%2==0) {
			System.out.println("You're the winner?");
		}
		else {
			System.out.println("I'm a winner!");
		}
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		char[][] N=new char[8][8];
		
		for(int i=0;i<N.length;i++) {
			String s=sc.next();
			for(int j=0;j<N[i].length;j++) {
				N[i][j]=s.charAt(j);
			}

		}
		int sum=0;
		for(int i=0;i<N.length;i++) {
			for(int j=0;j<N.length;j++) {
				if((i+j)%2==0) {
					if(N[i][j]=='F') {
						sum+=1;
					}
				}
			}
		}
		System.out.println(sum);
	}

}

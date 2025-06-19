import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] n=new int[4];
		for(int i=0;i<4;i++) {
			n[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int result;
				if(n[i]>n[j]) {
					result=n[i];
					n[i]=n[j];
					n[j]=result;
				}
			}
		}
		System.out.println(n[1]*n[3]);
		
		
	}

}

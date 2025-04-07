import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s=new int[3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			int a=sc.nextInt();
			s[i]=a;
		}
		Arrays.sort(s);
		
		for(int i=0;i<3;i++) {
			System.out.printf("%d ",s[i]);
		}
		
	}

}

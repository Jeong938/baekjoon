import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=s.nextInt();
		int count=s.nextInt();
		int[] c1=new int[count];
		int[] c2=new int[count];
		
		int sum1=0;
		for(int i=0;i<count;i++) {
			c1[i]=s.nextInt();
			c2[i]=s.nextInt();
			sum1+=c1[i]*c2[i];
		}
		if(sum==sum1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
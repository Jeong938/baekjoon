import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		
		double[] result=new double[4];
		
		result[0]=(double)A/C+(double)B/D;
		result[1]=(double)C/D+(double)A/B;
		result[2]=(double)D/B+(double)C/A;
		result[3]=(double)B/A+(double)D/C;
		
		int max=0;
		
		for(int i=0;i<4;i++) {
			if(result[i]>result[max]) {
				max=i;
			}
		}
		System.out.println(max);
		
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int j=s.nextInt();
		
		int arr[]=new int[j];
		
		for(int i=0;i<j;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			arr[i]=a+b;
		}
		for(int k=0;k<j;k++) {
			System.out.println(arr[k]);
		}
		
	}

}

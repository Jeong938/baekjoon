import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x= s.nextInt();
		String str="UOS";
		if(x%3==0) {
			System.out.println( str.substring(2,3));
		}else if(x%3==1) {
			System.out.println( str.substring(0,1));
		}else if(x%3==2) {
			System.out.println( str.substring(1,2));
		}
		
	}

}

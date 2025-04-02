import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int rail=s.nextInt();
		int flight=s.nextInt();
		
		if(rail>flight) {
			System.out.println("flight");
		}else {
			System.out.println("high speed rail");
		}
		
	}

}
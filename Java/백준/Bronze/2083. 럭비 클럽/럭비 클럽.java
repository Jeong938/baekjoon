import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String a=sc.next();
			int age=sc.nextInt();
			int kg=sc.nextInt();
			if(a.equals("#")&&age==0&&kg==0) {
				break;
			}else if(age>17||kg>=80) {
				System.out.println(a+" Senior");
			}else {
				System.out.println(a+" Junior");
			}
		}
	}

}

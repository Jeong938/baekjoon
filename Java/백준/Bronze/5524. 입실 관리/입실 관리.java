import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String[] s=new String[a];
		for(int i=0;i<a;i++) {
			s[i]=sc.next();
			s[i]=s[i].toLowerCase();
		}
		for(int i=0;i<a;i++) {
			System.out.println(s[i]);
		}
	}

}
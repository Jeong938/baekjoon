import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		
		int f=sc.nextInt();
		
		s+=f%60;
		m+=f/60;
		
		if(s>=60) {
			m+=s/60;
			s=s%60;
		}
		if(m>=60) {
			h+=m/60;
			m=m%60;
		}

		if(h>=24) {
			h%=24;
		}
		
		System.out.println(h+" "+m+" "+s);

	}

}

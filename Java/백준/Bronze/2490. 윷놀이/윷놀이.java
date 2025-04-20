import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int j=0;j<3;j++) {
			int[] s=new int[4];
			int a=0;
			for(int i=0;i<s.length;i++) {
				s[i]=sc.nextInt();
				if(s[i]==1) {
					a+=1;
				}
			}
			
			switch (a){
			case 0:
				System.out.println('D');
				break;
			case 1:
				System.out.println('C');
				break;
			case 2:
				System.out.println('B');
				break;
			case 3:
				System.out.println('A');
				break;
			case 4:
				System.out.println('E');
				break;
			
			}
		}
		
		
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		String AB=sc.next();
		String[] M=AB.split("");
		int a=0;
		int b=0;
		for(int i=0;i<N;i++) {
			if(M[i].equals("A")) {
				a++;
			}else if(M[i].equals("B")) {
				b++;
			}
		}
		
		if(a>b) {
			System.out.println("A");
		}else if(a<b){
			System.out.println("B");
		}else {
			System.out.println("Tie");
		}
		
	}

}

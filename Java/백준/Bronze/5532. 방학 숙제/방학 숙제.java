import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int L=s.nextInt();
		int kor=s.nextInt();
		int math=s.nextInt();
		int korl=s.nextInt();
		int mathl=s.nextInt();
		
		if(kor/korl>math/mathl) {
			L-=kor/korl;
			if(kor%korl!=0) {
				L-=1;
			}
		}else {
			if(math%mathl!=0) {
				L-=1;
			}
			L-=math/mathl;
		}
		
		System.out.println(L);
		
	}

	
}

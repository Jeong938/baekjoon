import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int tmp=s.nextInt();
		
		for(int i=1;i<10;i++) {
			int room=s.nextInt();
			tmp-=room;
		}
		System.out.println(tmp);

	}

}

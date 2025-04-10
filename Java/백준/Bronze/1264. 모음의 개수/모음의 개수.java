import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true){
			String a=sc.nextLine();
			
			if(a.equals("#")) {
				break;
			}
			
			int e=0;
			
			for(String s:a.split("")) {
				
				
				
				if(s.equals("a")) {
					e+=1;
				}
				if(s.equals("A")) {
					e+=1;
				}
				if(s.equals("e")) {
					e+=1;
				}
				if(s.equals("E")) {
					e+=1;
				}
				if(s.equals("i")) {
					e+=1;
				}
				if(s.equals("I")) {
					e+=1;
				}
				if(s.equals("o")) {
					e+=1;
				}
				if(s.equals("O")) {
					e+=1;
				}
				if(s.equals("u")) {
					e+=1;
				}
				if(s.equals("U")) {
					e+=1;
				}
			}
			System.out.println(e);
			
		}

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] phone=new int[sc.nextInt()];
		int Yfare=0,Mfare=0;
		for(int i=0;i<phone.length;i++) {
			phone[i]=sc.nextInt();
			
			Yfare+=(phone[i]/30+1)*10;
			Mfare+=(phone[i]/60+1)*15;
		}
		if(Yfare==Mfare) {
			System.out.println("Y M "+Yfare);
		}else if(Yfare>Mfare) {
			System.out.println("M "+Mfare);
		}else {
			System.out.println("Y "+Yfare);
		}

	}

}

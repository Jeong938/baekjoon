import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] AVGs=new int[5];
		int sum=0;
		for(int i=0;i<AVGs.length;i++) {
			AVGs[i]=sc.nextInt();
			if(AVGs[i]<40) {
				AVGs[i]=40;
			}
			sum+=AVGs[i];
		}
		System.out.println(sum/AVGs.length);
	}

}
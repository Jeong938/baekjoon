import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
       int[] b=new int[3];
       int[] j=new int[2];
       
       for(int i=0;i<b.length;i++) {
    	   b[i]=sc.nextInt();
       }
       
       for(int i=0;i<j.length;i++) {
    	   j[i]=sc.nextInt();
       }
       
       Arrays.sort(b);
       Arrays.sort(j);
       System.out.println(b[0]+j[0]-50);
	}

}
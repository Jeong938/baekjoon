import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] N=new int[sc.nextInt()];
		int M=sc.nextInt();
		
		for(int i=0;i<N.length;i++) {
			N[i]=i+1;
		}
		
		for(int i=0;i<M;i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;

			while (a< b) {
			    int temp = N[a];  // 임시 변수에 하나 저장
			    N[a] = N[b];    // 끝 값을 앞에 덮어씀
			    N[b] = temp;        // 임시 변수에 저장해둔 앞 값을 뒤에 덮어씀

			    a++;
			    b--;
			}
		}
		for(int i=0;i<N.length;i++) {
			System.out.printf("%d ",N[i]);
		}
		
	}

}
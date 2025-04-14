import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[3];
		BigInteger [] S = new BigInteger [3];
		
		for (int i = 0; i < N.length; i++) {
			int a;
			N[i] = sc.nextInt();
			S[i] = BigInteger.ZERO;
			for (int j = 0; j < N[i]; j++) {
				S[i] =S[i].add(sc.nextBigInteger());
			}
			a=S[i].compareTo(BigInteger.ZERO);
			if (a == 0) {
				System.out.println(0);
			} else if (a > 0) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}

	}

}

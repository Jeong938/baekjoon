import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//월,월별 날짜
		String[] Month= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[] Mi= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//한 줄 전체 입력 받기
		String input = sc.nextLine(); // 예: May 10, 1981 00:31

		//공백 기준으로 나누기
		String[] parts = input.split(" ");
		String M = parts[0];             // 월
		int d = Integer.parseInt(parts[1].replace(",", "")); // 일 (쉼표 제거)
		int y = Integer.parseInt(parts[2]); // 연도
		String[] HM = parts[3].split(":");  // 시:분

		int h = Integer.parseInt(HM[0]);
		int m = Integer.parseInt(HM[1]);

		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
			Mi[1] = 29;
		}
		
		int Mi_s=0; //총 날짜(시간,분) 구하기
		for(int i=0;i<Month.length;i++) {
			Mi_s+=Mi[i];
		}
		Mi_s=Mi_s*24*60;

		int index=0;
		for(int i=0;i<Month.length;i++) {
			if(M.equals(Month[i])) {
				index=i;
				break;
			}
		}

		int s_Mi=0;  //입력받은 날짜의 (시간,분) 구하기
		for(int i=0;i<index;i++) {
			s_Mi+=Mi[i];
		}
		s_Mi=s_Mi*24*60+(d-1)*24*60+(h*60)+m;

		double tenpro=(double)s_Mi/(double)Mi_s*100;
		
		System.out.printf("%.15f",tenpro);
	}
}
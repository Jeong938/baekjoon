import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt(); //수열의 크기를 사용자로 부터 입력받음
		int[] A=new int[N]; //크기 N인 배열 A 선언
		
		for(int i=0;i<N;i++) {
			A[i]= sc.nextInt();
		}
		//배열에 사용자 입력을 받아 N개의 수열 값 저장
		Stack<Integer> stack=new Stack<>(); //스택 생성
		StringBuffer bf=new StringBuffer(); //+,- 저장되는 버퍼 생성
		
		int num=1;   //스택에 push or pop 되는 오름차순 숫자
		boolean result=true;
		
		//화면에 결괏값 출력을 제어하기 위한 논리 값
		//true -> +,-의 조합 출력(수열생성), false -> NO 출력(수열 생성 불가)
		for(int i=0;i<A.length;i++){
			int su=A[i];
			
			if(su>=num) {
				while(su>=num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}else {
				int p=stack.pop();
				//수열수와 비교위해 pop() 결과값을 저장
				if(p != su) {
					System.out.println("NO");
					result=false;  //출력제어,bf에 저장된 값 출력 금지
					break;   //수열수와 일치하지 않아 수열 생성 불가
				}else {
					bf.append("-\n");
				}
				//pop() 실행되어 '-' 버퍼에 누적.(수열수와 일치
			}
			
		}
		
		//수열이 생성된 경우에만 bf에 저장된 값 출략
		if(result) {
			System.out.println(bf.toString());
			
		}
		sc.close();
	}

}

package loop;

public class Ex08 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) { //i가 1부터 10이 될때까지, 블록을 10번 수행
			if(i%2 == 0) {//i가 짝수라면
				continue; //다음 코드를 수행하지 않고 skip함
			}
			sum = sum + i; //i가 홀수라면 sum에 더하기
		}
		
		System.out.println(sum);
		
	}
}

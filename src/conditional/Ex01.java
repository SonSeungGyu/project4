package conditional;

public class Ex01 {
	public static void main(String[] args) {
		
		int age = 5;
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		}	
		
		//블록의 의미
		if(age >= 9) {
			int temp = 0; // temp는 블록이 끝나기 전까지만 존재함
			System.out.println();
		
		}
		
		System.out.println(); //변수가 소멸되어 에러남
		
	}
}

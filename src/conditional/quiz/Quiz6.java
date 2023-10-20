package conditional.quiz;

public class Quiz6 {
	public static void main(String[] args) {
		
		int score = 85;
		
		if(score>=90) {
			System.out.println("수");
		}else if(score>=80) {
			System.out.println("우");
		}else if(score>=70) {
			System.out.println("미");
		}else {
			System.out.println("양");
		}
		
		
		System.out.println(aa(98));
	}
	static char aa(int score) {
		if(score>=90) {
			return '수';
		}else if(score>=80) {
			return '우';
		}else if(score>=70) {
			return '미';
		}else {
			return '양';
		}
	}
}

package conditional.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		
		int age = 1000000;
		char gender = 'F';
		
		if(age >= 8 && gender == 'F') {
			System.out.println("여학생입니다.");
		}
		
		System.out.println(aa(4,'F'));
	
	}
	
	static String aa(int age, char gender) {
		return age >= 8 && gender =='F' ? "여학생입니다." : "조건에 맞지 않습니다.";
	}
}

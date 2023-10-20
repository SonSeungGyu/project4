package conditional.quiz;

public class Quiz4 {
	public static void main(String[] args) {
		int i = 100;
		
		if(i>100 && i<200) {
			System.out.println("i는 100초과, 200미만");
		}else {
			System.out.println("i는 100이하, 200이상");
		}
	}
}

package conditional;

public class Ex04 {

	public static void main(String[] args) {
		int rank = 1;
		
		switch(rank) { 
		case 1: //rank 값이 1이면
			System.out.println("금");
			break;
		case 2:
			System.out.println("은");
			break;
		case 3:
			System.out.println("동");
			break;
		default://변수와 일치하는 값이 없으면
			System.out.println("nope");
		}
		
	}
}

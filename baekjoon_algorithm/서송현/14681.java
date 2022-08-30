import java.util.Scanner;
public class Quadrant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int q1 = scanner.nextInt();
		int q2 = scanner.nextInt();
		
		
		if(q1 > 0 && q2 > 0) {
			System.out.println("1");
	}else if(q1 < 0 &&q2>0) {
		System.out.println("2");
	}else if(q1 < 0 && q2 < 0) {
		System.out.println("3");
	}else {
		System.out.println("4");
		
	}


	}
}

import java.util.Scanner;
public class Alarm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (M < 45) {
			if (H > 0) {
				System.out.println((H - 1 )+" "+(60 + (M - 45)));
			}
			else {
				System.out.println((24 - 1 )+" "+(60 + (M - 45)));
			}
		}else if(M >= 45) {
			System.out.println(H+" "+ (M - 45));
		}

	}

}

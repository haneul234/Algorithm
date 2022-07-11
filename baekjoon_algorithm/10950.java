import java.util.Scanner;
public class RepetitiveSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A,B;
		int T = scanner.nextInt();
		
		for(int i=0;i<T;i++) {
			A=scanner.nextInt();
			B=scanner.nextInt();
			System.out.println(A+B);
			
		}

	}

}

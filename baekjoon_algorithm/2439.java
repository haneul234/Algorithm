import java.util.Scanner;
public class ReverseStar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n=scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			System.out.println();
		}


	}

}
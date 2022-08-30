import java.util.Scanner;
public class Rest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Á¤¼ö 3°³¸¦ ÀÔ·ÂÇÏ¼¼¿ä >>");
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		System.out.println((A + B) % C );
		System.out.println(((A % C) + (B % C)) % C );
		System.out.println((A * B) % C );
		System.out.println(((A % C) * (B % C)) % C);

	}

}

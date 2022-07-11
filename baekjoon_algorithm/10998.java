import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수의 값을 입력하세요 >> ");
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		int mul=A*B;
		System.out.println("두 정수의 곱 : "+mul);
	}

}

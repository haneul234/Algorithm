import java.util.Scanner;
public class BreakEvenPoint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println();
		int A=scanner.nextInt(); //불변 비용
		int B=scanner.nextInt(); //가변 비용
		int C=scanner.nextInt(); //상품 가격
		
		if(B>=C) System.out.println("-1");
		else System.out.println(A/(C-B)+1);
		
	}

}

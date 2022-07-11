import java.util.Scanner;
public class MulOp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c,d,e;
		
		System.out.print("Á¤¼ö 2°³¸¦ ÀÔ·ÂÇÏ¼¼¿ä >> ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		c=b%10;
		d=b%100;
		e=b-b%100;
		
		System.out.println(a*c);
		System.out.println(d/10*a);
		System.out.println(e/100*a);
		System.out.println(a*b);
		
		

	}

}

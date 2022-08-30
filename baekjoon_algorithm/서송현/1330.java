import java.util.Scanner;
public class Compare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두개의 정수를 입력하세요 >> ");
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		
		if(a>b){
		    System.out.println(a+">"+b);
		}else if(a<b){
			System.out.println(a+"<"+b);
		}else{
			System.out.println(a+"=="+b);
		}

	}

}

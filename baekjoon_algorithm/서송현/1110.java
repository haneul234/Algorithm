import java.util.Scanner;
public class CircleSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		int fnum,snum,sum,result=0,c=0;
		
		if (num < 10) {
			num *= 10;
		}
		result = num;
		while (true) {
			fnum = result / 10;
			snum = result % 10;
			sum = fnum + snum;
			result = (snum * 10) + (sum % 10);
			c++;

			if (num == result) break;
		}
		System.out.print(c);

	}

}

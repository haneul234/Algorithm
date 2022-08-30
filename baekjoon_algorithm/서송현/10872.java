import java.util.*;

public class Factorial {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요 >>");
        int n = scan.nextInt();

        System.out.println(n+"! = "+fact(n));
    }
}

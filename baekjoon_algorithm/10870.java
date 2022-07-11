import java.util.*;

public class Fibo {
    static int fibo(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        return fibo(n-2)+fibo(n-1);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요 >> ");
        int n=scan.nextInt();
        System.out.println(fibo(n));
    }
}


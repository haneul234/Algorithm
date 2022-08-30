import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 1;
        int H, W, N;
        for (int i = 0; i < T; i++) {
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();

            int n1=(N/H)+1;
            int n2=N%H;

            if(n2==0){
                n1=N/H;
                n2=H;

            }
            System.out.println((n2*100)+n1);
        }
    }

}


/*
H : 호텔 층
W : 층당 방 수
N : 몇번째 손님

1층부터 101~H0W채운 후 201~H0W을 채운다

n1은 (N/H)+1로 몇 호인지 계산하고
n2는 n2=N%H로 몇 층인지 계산한다.

*/

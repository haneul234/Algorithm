import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[15][15];


        for(int i=0;i<15;i++){
            arr[0][i] =i; //0층 1호~14호까지 1~14순으로 저장
            arr[i][1] =1; //각 층의 1호를 1로 저장
        }

        for(int i=1;i<15;i++){
            for(int j=2;j<15;j++){
                arr[i][j]=arr[i][j-1]+arr[i-1][j]; //arr[i][j-1] : 해당층의 전 호 + 아래층의 해당 호 = 구하고자 하는 호실 사람 수
            }
        }
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int k= sc.nextInt();
            int n= sc.nextInt();
            System.out.println(arr[k][n]);
        }
    }
}

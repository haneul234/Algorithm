
import java.util.*;
public class Baekjoon_2447 {
    public static void star(int i,int j,int n){
        if((i/n)%3==1&&(j/n)%3==1){
            System.out.print(" ");
        }else {
            if(n/3==0) System.out.print("*");
            else star(i,j,n/3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                star(i,j,n);
            }
            System.out.println();
        }

    }
}

/* => 시간 초과 발생 */

import java.util.*;
import java.io.*;
public class Main {
    static StringBuffer sb = new StringBuffer();
    public static void star(int i,int j,int n){
        if((i/n)%3==1&&(j/n)%3==1){
            sb.append(" ");
        }else {
            if(n/3==0) sb.append("*");
            else star(i,j,n/3);
        }
    }
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                star(i,j,n);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}

/* => StringBuffer와 BufferedReader를 사용하여 입력받고 출력하는 시간을 줄여 시간초과 해결 */


/* ---------------------------------------------------------------------------------------------------------------------------------------
|0|1|2|
|:---:|:---:|:---:|
| |0|1|2|
|0|*|*|*|
|1|*| |*|
|2|*|*|*|

(1,1)에 공백을 볼 수 있다.

위를 반복 한다면 1,4,7,10,13,16,19,33,25,28에 공백이 있고 이를 i%3==1으로 계산할 수 있다.
27의 공백 또한 위와 같으므로 (i/n)%3==1&&(j/n)%3==1로 식을 만들 수 있다.
N으로 검사했을 때 빈칸은 N/3으로 검사해도 빈킨이기 때문에 빈칸을 바로 출력하고, 빈칸이 아닌 경우 재귀함수 start(i,j,n/3)으로 해서 계산한다.
*/

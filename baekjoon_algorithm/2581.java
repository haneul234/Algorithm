import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0, min = n;
        for (int i = m; i <= n; i++) {
            boolean prime = true;
            if(i==1){
                prime=false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime==true) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
            prime=true;
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
      sc.close();
    }
    }


/*
정수 두개를 입력 받고 m부터 n까지 반복하여 2부터 해당 숫자까지 반복하여 소수를 찾는다.
해당 숫자를 2부터 해당 숫자까지 나누었을때 나누어 떨어지면 소수가 아니므로 prime을 false로 지정한다.
1은 소수가 아니므로 prime을 false로 저장한다.
해당 숫자가 소수이면 sum에 해당 숫자를 더하고, 최솟값을 구한다.
*/


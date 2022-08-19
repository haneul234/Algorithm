import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0, min = n;
        for (int i = m; i < n; i++) {
            boolean prime = true;
            if(i==1){
                prime=false;
            }
            for (int j = 2; j <= i; j++) {
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


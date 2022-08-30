// 방법 1
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int j;
            for (j=2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    break;
                }
            }
            if(j==arr[i]){
                count++;
            }
        }
        System.out.println(count);

    }}

// 방법2
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j=2; j <= arr[i]; j++) {
            if(j==arr[i]){
                count++;
            }
            if (arr[i] % j == 0) {
                    break;
                }
            }
            
        }
        System.out.println(count);

    }}


/*
몇개의 숫자를 입력받을지 입력받는다.
입력 받은 만큼 배열의 크기를 설정해준다.
배열에 입력받은 숫자를 저장하고, 2부터 해당 숫자까까지 숫자를 증가시키며 나누었을때 나머지가 0이면 break로 멈춘다.
나누는 숫자와 해당 숫자가 같으면 count++해준다.
*/

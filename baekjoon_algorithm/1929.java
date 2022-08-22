import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
     
        boolean[] arr = new boolean[num2+1];  //디폴트로 false로 초기화 한다.

        for(int i=2;i<=num2;i++){ //2부터 소수이므로 2부터 시작한다.
            if(arr[i]) continue; // 소수이면 continue한다.
                for (int j = 2; j *i <= num2; j++) { //i*j로 해당 배수는 모두 true 초기화하여 제외시킨다.
                    arr[i * j] = true;
                }

        }
        arr[0]=arr[1]=true; //0과 1은 소수가 아니므로 true로 초기화한다.
        for(int i=num1;i<=num2;i++){ //작은 숫자부터 큰 숫자까지 반복하여 arr[i]값이 false면 해당 값을 출력한다.
            if(arr[i]==false)
                System.out.println(i);
        }


    }
}

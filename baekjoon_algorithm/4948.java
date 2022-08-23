import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while(true){
          int n=sc.nextInt();
          if(n==0) break;
          boolean[] arr = new boolean[2*n+1];
          arr[0]=arr[1]=true; //0과 1은 소수가 아니기 때문에 true로 초기화한다.
          for(int i=2;i<=2*n;i++){
              for(int j=2;j*i<=2*n;j++){ //i*j의 배수들은 모두 소수가 아니므로true로 초기화한다.
                  arr[i*j]=true;
              }
          }
          int count=0;
              for(int j=n+1;j<=2*n;j++){ //n보다 크고 2n보다 작거나 같은 숫자들중에서
                  if(arr[j]==false){ //false인 경우 소수이므로
                      count++; //1증가 시킨다.
                  }
              }
          System.out.println(count);
      }
    }
}


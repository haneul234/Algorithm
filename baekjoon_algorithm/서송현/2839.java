import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int count =0;

while(true){
if(N%5==0){
    System.out.println(N/5 +  count);
    break;
}else if(N<0){
    System.out.println(-1);
    break;
}
    N = N-3;
    count++;
}
}
}

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


        if (N == 4 || N == 7) {
            System.out.println(-1);
        } else if (N % 5 == 0) {
            System.out.println(N / 5);
        } else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        } else if (N % 5 == 2 || N % 5 == 4) {
            System.out.println((N / 5) + 2);
        }
    }}*/

/*
최소 설탕봉투를 옮기려면 큰 수인 5로 나누어야지 최소 봉투만 옮길 수 있다.
5로 나누어 떨어지면 if문에 들어가고 아니라면 if문이 아닌 N=N-3; count++;문으로 이동해서 실행한다.
n이 3과 5로 안 나누어지면 -1을 출력한다.
*/

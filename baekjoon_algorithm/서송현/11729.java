import java.util.*;
public class Baekjoon_11729 {
    public static StringBuilder sb = new StringBuilder();
    public static void Hanoi(int num, int from, int by, int to){ //하노이 함수
        if(num==1) { // 이동할 원반 수가 1개라면
            sb.append(from+" "+to+"\n"); //원반1을 from에서 to로 이동
            return;
        }
        else{
            Hanoi(num-1,from,to,by); //num-1개를 1에서 2로 이동
            sb.append(from+" "+to+"\n"); //1개를 1에서 3으로 이동
            Hanoi(num-1,by,from,to); //num-1개를 2에서 3으로 이동
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sb.append((int)(Math.pow(2,num)-1)).append('\n');
        Hanoi(num,1,2,3);
        System.out.println(sb);
    }
}


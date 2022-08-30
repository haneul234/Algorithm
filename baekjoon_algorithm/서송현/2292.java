/* 방의 개수가 6개씩 늘어나는 규칙성을 가진다.
1개를 지날 때 1-1 : 1개
2개를 지날 때 2-7 : 6개
3개를 지날 때 8-19 : 12개
4개를 지날 때 20-37 : 18개
5개를 지날 때 38-61 : 24개
*/


import java.util.*;


public class BeeHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = 2;
        int num=sc.nextInt();
        int count=1;

        if(num==1){
            System.out.println("1");
        }else{
            while(range<=num){
              range = range+(6*count);
              count++;
            }
            System.out.println(count);
        }
    }
}


package baekjoon_algorithm.src;

import java.util.*;

public class Baekjoon_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=2;i<=num;i++){
            while(num%i==0){
                System.out.println(i);
                num/=i;
            }
        }
    }
}

/*
2부터 해당 숫자까지의 반복문을 만들고,
그 반복문 안에 2부터 해당 숫자를 나누는데,
나누어 떨어질 경우 해당 값을 출력하고,
아닌경우 while문을 탈출해 for문을 반복하여 나누는 값을 1 증가시킨다.
*/

/*홀수번째 대각선은 위에서 아래로 증가, 짝수번째 대각선은 아래에서 위로 증가
분모는 분자의 반대 방향으로 이루어져 있기때문에, 분자를 구하고나서 i+1에 분자를 빼면 분모를 구할 수 있다.
i번째 대각선에는 i개의 원소가 있고, num이 몇번째 대각선에 있는지 알기위해서는 i를 순차적으로 증가시키면서 빼주는데 이때 num이 i보다 작아진 경우에 해당 i번재 대각선에 num번째 원소가 존재한다.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        while(num>i){
            num-=i;
            i++;
        }

        if(i%2==1){
            System.out.println((i+1-num)+"/"+num);
        }else{
            System.out.println(num+"/"+(i+1-num));
        }
    }
}



/*
ex) num=14
num  i
14   1
13   2
11   3
8    4
4    5
*/

# sliding window algorithm
---
## 문제

n일 동안에 매출기록이 주어지면 n일 동안의 매출기록 중에서 연속된 k일 동안의 최대 매출액이 얼마인지 구하라
 
입력: 10(n일동안의 매출기록)  3(k일 동안의 최대 매출기록)  12 15 **11 20 25** 10 20 19 13 15

출력: 56 (11+20+25)

### 소스코드

~~~ java
public int solution(int k,int n ,int[] a) {
   int answer = 0;
   int max = 0;
   for(int i =0;i<k;++i)
   {
       max +=a[i];
       answer = max;
   }
   for(int i=k;i<=(n-k);++i)
   {
       max -= a[i-k];
       max += a[i];
       if(max>answer)
       {
           answer = max;
       }
   }
~~~



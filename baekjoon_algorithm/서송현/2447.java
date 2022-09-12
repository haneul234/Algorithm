
~java
import java.util.*;
public class Baekjoon_2447 {
    public static void star(int i,int j,int n){
        if((i/n)%3==1&&(j/n)%3==1){
            System.out.print(" ");
        }else {
            if(n/3==0) System.out.print("*");
            else star(i,j,n/3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                star(i,j,n);
            }
            System.out.println();
        }

    }
}
~java

~java
import java.util.*;
import java.io.*;
public class Main {
    static StringBuffer sb = new StringBuffer();
    public static void star(int i,int j,int n){
        if((i/n)%3==1&&(j/n)%3==1){
            sb.append(" ");
        }else {
            if(n/3==0) sb.append("*");
            else star(i,j,n/3);
        }
    }
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                star(i,j,n);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
~java

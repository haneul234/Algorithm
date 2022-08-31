import java.util.*;

public class Main {
    static String bar=""; 
    public static void Recur(int n){
      //언더바를 미리 전역변수로 선언하면 bar 초기화 영향을 받지 않아서 "라고 답변하였지" 부분에서 띄어쓰기를 구현
        String underBar=bar; //처음에는 여백 없음

        if(n==0){ //n이 0이면 출력하고 재귀함수 종료
            System.out.println(underBar +"\"재귀함수가 뭔가요?\"");
            System.out.println(underBar +"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(underBar + "라고 답변하였지.");
            return;
        }
            //0이 되기 전까지 재귀함수 반복
            System.out.println(underBar+ "\"재귀함수가 뭔가요?\"");
            System.out.println(underBar + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(underBar + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(underBar + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
        bar+="____"; //____ 추가
        Recur(n-1); //재귀함수 호출
        // 재귀에서 빠져나오면서 여백이 많은 순서부터 출력
        System.out.println(underBar+"라고 답변하였지.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        Recur(n);//재귀함수 호출
    }
}

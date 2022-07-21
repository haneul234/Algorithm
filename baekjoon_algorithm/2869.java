import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);
    }
}

/*
A = 올라간 수, B = 미끄러지는 수, V = 높이
(V-B)%(A-B)==0이면 미끄러지지 않고,
(V-B)%(A-B)!=0이면 미끌어 진다.
*/

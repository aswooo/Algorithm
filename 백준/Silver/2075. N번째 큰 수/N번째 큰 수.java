import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {   //프로그램의 시작부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 선물을 충전
            for(int j = 0; j < n; j++){
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }
        for(int i = 0; i < n; i++)
            answer = pq.poll();
        System.out.println(answer);
    }
}

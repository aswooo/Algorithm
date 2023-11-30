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

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            if(a == 0){ //  아이를 만난 경우
                if (!pq.isEmpty()) {  // 줄 선물이 있을 경우
                    System.out.println(pq.poll());
                } else {
                    System.out.println(-1);
                }
            }
            else {  // 선물을 충전
                for(int j = 0; j < a; j++){
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
    }
}

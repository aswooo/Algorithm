import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());   // 다리를 건너는 차의 수
        int W = Integer.parseInt(st.nextToken());   // 다리의 길이
        int L = Integer.parseInt(st.nextToken());   // 다리의 최대 하중
        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        int now_w = 0;
        int answer = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            truck.add(Integer.parseInt(st.nextToken()));
        }
        for(int i = 0; i < W; i++) {
            bridge.add(0);
        }

        while(!truck.isEmpty()){
            answer++;
            now_w -= bridge.poll();
            if(truck.peek() + now_w <= L) { // 추가가 가능할 경우
                now_w += truck.peek();
                bridge.add(truck.poll());
            }
            else {
                bridge.add(0);
            }
        }
        answer += W;
        System.out.println(answer);
    }
}

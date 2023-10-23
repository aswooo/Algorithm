import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Long N, answer;
        StringTokenizer st;
        PriorityQueue<Long> pq = new PriorityQueue<Long>(Comparator.naturalOrder());

        for(int j = 0; j < T; j++){
            N = Long.parseLong(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            answer = 0L;
            for(int i = 0; i < N; i++){
                Long num = Long.parseLong(st.nextToken());
                pq.add(num);
            }
            while(pq.size() != 1){
                Long temp = pq.poll() + pq.poll();
                answer += temp;
                pq.add(temp);
            }
            System.out.println(answer);
            pq.clear();
        }
    }

}

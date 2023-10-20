import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {   //프로그램의 시작부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());   // 카드의 수
        int m = Integer.parseInt(st.nextToken());   // 합체의 수
        Long answer = 0L;
        PriorityQueue<Long> pq = new PriorityQueue<Long>(Comparator.naturalOrder());

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            Long num = Long.parseLong(st.nextToken());
            pq.add((num));
        }
        for(int j = 0; j < m; j++){
            Long temp = pq.poll() + pq.poll();
            pq.add(temp);
            pq.add(temp);
        }
        while(!pq.isEmpty())
            answer += pq.poll();
        System.out.println(answer);
    }

}

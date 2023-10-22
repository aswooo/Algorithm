import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.naturalOrder());

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            pq.add(num);
        }
        while(pq.size() != 1){
            int temp = pq.poll() + pq.poll();
            answer += temp;
            pq.add(temp);
        }
        System.out.println(answer);
    }

}

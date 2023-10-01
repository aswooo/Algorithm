import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            Long answer = 0L;
            int K = Integer.parseInt(br.readLine());
            Long max = 0L;
            Long[] array = new Long[K];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = K-1; j >= 0; j--)
                array[j] = Long.parseLong(st.nextToken());
            for(Long temp: array){
                if(max < temp)
                    max = temp;
                else if(max > temp){
                    answer += max - temp;
                }
            }
            System.out.println(answer);
        }
    }
}

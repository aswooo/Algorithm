import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int answer = 0;
    static int[] numbers;
    static int[] add;
    static int N, M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        numbers = new int[N];
        add = new int[N+1];
        int temp = 0;
        for(int i = 0; i < N; i++){
             numbers[i] = Integer.parseInt(st.nextToken());
             add[i+1] = add[i] + numbers[i];
        }
        for(int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(add[j] - add[i-1]);
        }
    }
} 
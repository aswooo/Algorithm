import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        long[] dp = new long[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long answer = -1;

        for(int i = 1; i <= N; i++){
            dp[i] = arr[i];
            for(int j = 1; j < i; j++){
                if(arr[j] < arr[i]) { // 증가하는 수열의 경우
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}

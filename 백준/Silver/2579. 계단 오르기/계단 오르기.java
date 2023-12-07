import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N + 1][2];
        int[] stair = new int[N];

        for(int i = 0; i < N; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(stair[0]);
            return;
        }

        dp[1][0] = stair[0];
        dp[2][0] = stair[0] + stair[1];
        dp[2][1] = stair[1];

        for(int i = 3; i < N + 1; i++){
            dp[i][0] = dp[i-1][1] + stair[i-1];
            dp[i][1] = Math.max(dp[i-2][1], dp[i-2][0]) + stair[i-1];
        }
        System.out.println(Math.max(dp[N][0], dp[N][1]));
    }
}




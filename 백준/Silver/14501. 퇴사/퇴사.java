import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];
        int[] money = new int[N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            money[i] = Integer.parseInt(st.nextToken());
        }   // 입력 값을 배열에 세팅
        int[] dp = new int[N + 1];

        for(int i = 0; i < N; i++) {
            if(i + time[i] <= N) {  // 퇴사 이후는 불가
                dp[i + time[i]] = Math.max(dp[i + time[i]], dp[i] + money[i]);
            } // 방금의 계산과 이전에 했을 계산 중 큰 금액 선택
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }
        System.out.println(dp[N]);
    }
}


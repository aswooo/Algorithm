import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Long x = Long.parseLong(st.nextToken());   // 좌표
        Long y = Long.parseLong(st.nextToken());   // 좌표
        Long w = Long.parseLong(st.nextToken());   // 한칸 소요시간
        Long s = Long.parseLong(st.nextToken());   // 대각선 소요시간
        Long answer = 0L;
        answer = (x + y) * w;

        if((x + y) % 2 == 1)  // 홀수일 경우
            answer = Math.min((Math.max(x, y) - 1) * s + w, answer);
        else
            answer = Math.min(Math.max(x, y) * s, answer);
        answer = Math.min((Math.min(x, y)) * s + (Math.abs(x - y)) * w, answer);

        System.out.println(answer);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int max = 0, odd = 0;
        int answer = 0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            max = 0;
            odd = 0;
            for(int j = i; j < N; j++){
                if(odd > K)
                    break;
                if(num[j] % 2 == 0){
                    max += 1;
                }
                else
                    odd++;

            }
            answer = Math.max(answer, max);
        }
        System.out.println(answer);
    }
}

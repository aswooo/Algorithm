import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int answer = 0, temp = 0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] count = new int[100001];
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0, end = 0;
        while(start < N){
            while(end < N && count[arr[end]] < K){
                temp++;
                count[arr[end]]++;
                end++;
            }
            answer = Math.max(answer, temp);
            count[arr[start]]--;
            start++;
            temp--;
        }

        System.out.println(answer);
    }
}

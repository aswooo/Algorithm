import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Long answer = 0L;

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 1; i <= N; i++){
            answer += Math.abs(i - arr[i]);
        }
        System.out.println(answer);
    }
}
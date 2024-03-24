import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N * 2];
        for (int i = 0; i < N * 2; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int min = arr[0] + arr[N * 2 - 1];
        for(int i = 0; i < N; i++){
            min = Math.min(arr[N * 2 - 1 - i] + arr[i], min);
        }
        System.out.println(min);
    }
}
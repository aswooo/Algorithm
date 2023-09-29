import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int answer = 0;

        for (int i = 0; i < N; i++)
            array[i] = Integer.parseInt(br.readLine());
        for (int i = N - 1; i > 0; i--){
            if(array[i] <= array[i-1]) {
                answer += array[i - 1] - (array[i] - 1);
                array[i-1] = array[i] - 1;
            }
        }
        System.out.println(answer);
    }
}

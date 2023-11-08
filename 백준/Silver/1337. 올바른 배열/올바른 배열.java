import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        for (int i = 0; i < N; i++) {
            int temp = 1;
            for(int j = i + 1; j < N; j++){
                if(num[i] - num[j] > -5)
                    temp++;
                else
                    break;
            }
            max = Math.max(temp, max);
        }
        System.out.println(5 - max);
    }
}

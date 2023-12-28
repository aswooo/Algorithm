import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[][] array = new int[41][2];
        array[0] = new int[]{1, 0};
        array[1] = new int[]{0, 1};

        for(int i = 2; i <= 40; i++){
            array[i] = new int[]{array[i -1][0] + array[i - 2][0], array[i - 1][1] + array[i - 2][1]};
        }
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(array[N][0]).append(" ").append(array[N][1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}

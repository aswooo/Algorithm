import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] triple = new int[n][n];
        int t1, t2;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j <= i; j++) {
                triple[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    t1 = triple[i][j] + triple[i - 1][0];
                else
                    t1 = triple[i][j] + triple[i - 1][j - 1];
                t2 = triple[i][j] + triple[i - 1][j];
                triple[i][j] = Math.max(t1, t2);
            }
        }
        System.out.println(Arrays.stream(triple[n-1]).max().getAsInt());
    }
}

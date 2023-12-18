import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(br.readLine());

        for (int t = 0; t < num; t++) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());

            for (int i = 2; i <= n; i++) {
                int count = 0;
                while (n % i == 0) {
                    n /= i;
                    count++;
                }

                if (count != 0) {
                    sb.append(i + " " + count + "\n");
                }
            }
            System.out.print(sb.toString());
        }
    }
}



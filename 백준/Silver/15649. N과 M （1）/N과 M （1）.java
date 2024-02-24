import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static int N, M, count;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++){
            visited = new boolean[N + 1];
            count = 1;
            dfs(i);
        }
    }

    public static void dfs(int number) {
        visited[number] = true;
        sb.append(number).append(" ");
        if (count == M)
            System.out.println(sb.toString());
        else if (count < M) {
            for (int i = 1; i <= N; i++) {
                if (!visited[i] && count < M) {
                    count++;
                    dfs(i);
                    visited[i] = false;
                }
            }
        }
        count--;
        sb.delete(sb.length() - 2, sb.length());
    }
}


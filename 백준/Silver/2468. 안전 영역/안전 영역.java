import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        boolean[][] visited = new boolean[N][N];
        int[][] arr = new int[N][N];
        int answer = 0;
        int count = 1;
        int h = 0;


        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while(count != 0){
            if(count > answer)
                answer = count;
            count = 0;
            visited = new boolean[N][N];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++){
                    if(arr[i][j] <= h)
                        visited[i][j] = true;
                }
            }
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++){
                    if(visited[i][j] == false){
                        dfs(visited, i, j, N);
                        count++;
                    }
                }
            }
            h++;
        }
        System.out.println(answer);
    }

    public static void dfs(boolean[][] visited, int i, int j, int N){
        visited[i][j] = true;
        for(int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < N && y >= 0 && y < N && !visited[x][y]) {
                dfs(visited, x, y, N);
            }
        }
    }
}




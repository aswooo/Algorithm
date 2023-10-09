import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int answer = 0;
    static boolean[][] map;
    static boolean[][] visited;
    static int T, N, M, K;
    static int direction[][] = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine()); // 테스트의 수

        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken()); // 밭의 가로
            M = Integer.parseInt(st.nextToken()); // 밭의 세로
            K = Integer.parseInt(st.nextToken()); // 배추의 개수
            map = new boolean[N][M];
            visited = new boolean[N][M];
            for(int i = 0; i < K; i++){
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = true;
            }
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++)
                    if(!visited[i][j] && map[i][j]){
                        answer++;
                        dfs(i, j);
                    }
            }

            System.out.println(answer);
            answer = 0;
        }
    }
    
    public static void dfs(int x, int y){
        for(int i = 0; i < direction.length; i++){
            int x1 = direction[i][0];
            int y1 = direction[i][1];
            if(x + x1 >= 0 && x + x1 < N && y + y1 >= 0 && y + y1 < M){
                if(!visited[x + x1][y + y1] && map[x + x1][y + y1]){
                    visited[x + x1][y + y1] = true;
                    dfs(x + x1, y + y1);
                }
            }
        }
    }
}

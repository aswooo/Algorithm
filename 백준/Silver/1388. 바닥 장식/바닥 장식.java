import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int answer = 0;
    static char[][] map;
    static boolean[][] visited;
    static int N, M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];
        map = new char[N][M];
        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++)
                map[i][j] = line.charAt(j);
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++)
                if(!visited[i][j]){
                    dfs(i, j, map[i][j]);
                }
        }
        
        System.out.println(answer);
    }
    
    public static void dfs(int n, int m, char k){
        if(n == N || m == M){
            answer++;
            return;
        }

        if(map[n][m] != k){
            answer++;
            return;
        }
        else {
            if(k == '-')
                dfs(n, m+1, k);
            else
                dfs(n+1, m, k);
            visited[n][m] = true;
        }
    }
}


//st = new StringTokenizer(br.readLine(), " ");

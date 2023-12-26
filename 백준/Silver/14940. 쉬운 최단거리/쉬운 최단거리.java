import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] array;
    static boolean[][] visited;
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};
    static int N, M, tx, ty;
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
                if(array[i][j] == 2){
                    tx = i;
                    ty = j;
                    array[i][j] = 0;
                }
                else if(array[i][j] == 1){
                    array[i][j] = -1;
                }
            }
        }
        dfs(tx, ty);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++){
                sb.append(array[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public static void dfs(int x, int y){
        queue.add(new int[]{x, y});
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            for(int i = 0; i < 4; i++){
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];
                if(check(nx, ny)){
                    visited[nx][ny] = true;
                    array[nx][ny] = array[temp[0]][temp[1]] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }

    public static boolean check(int nx, int ny){    // 갈 수 있는 땅인지 확인
        if(nx < N && ny < M && nx >= 0 && ny >= 0 && !visited[nx][ny] && array[nx][ny] != 0)
            return true;
        else
            return false;
    }
}



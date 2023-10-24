import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static boolean[][] map;
    static boolean [][] visited;

    static int[] dic_x = {0, -1, 0, 1}; // 우하좌상
    static int[] dic_y = {1, 0, -1, 0};
    static int answer = 0;
    static int max = 0;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int answer = 0;
        int max = 0;
        map = new boolean[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < m; j++){
                if(st.nextToken().equals("1"))
                    map[i][j] = true;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && map[i][j]){
                    answer++;
                    int temp = dfs(i, j, 1);
                    if(temp > max)
                        max = temp;
                }
            }
        }
        System.out.println(answer);
        System.out.println(max);
    }

    static int dfs(int x, int y, int size){
        visited[x][y] = true;
        for(int i = 0; i < dic_x.length; i++){
            int x1 = x + dic_x[i];
            int y1 = y + dic_y[i];
            if(x1 >= 0 && y1 >= 0 && x1 < n && y1 < m && !visited[x1][y1] && map[x1][y1]){
                size = dfs(x1, y1, ++size);
            }
        }
        return size;
    }
}

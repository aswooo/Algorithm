import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer> answer = new ArrayList<>();
    static int count;
    static boolean[][] visited;
    static boolean[][] map;
    static int N, h;
    static StringTokenizer st;
    static int[] xd = {1, -1, 0, 0};
    static int[] yd = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //st = new StringTokenizer(br.readLine(), "");
        N = Integer.parseInt(br.readLine()); // 가로, 세로
        visited = new boolean[N][N];
        map = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String[] data = br.readLine().split("");
            for(int j = 0; j < N; j++) {
                if(data[j].equals("1"))
                    map[i][j] = true;
            }
        }

        for(int i =0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] && !visited[i][j]){
                    count = 0;
                    count++;
                    dfs(i, j);
                    answer.add(count);
                }
            }
        }
        System.out.println(answer.size());
        answer.sort(Comparator.naturalOrder());
        for (int temp : answer) {
            System.out.println(temp);
        }
    }


    public static void dfs(int x, int y){
        for(int i = 0; i < 4; i++){
            visited[x][y] = true;
            int x1 = x + xd[i];
            int y1 = y + yd[i];
            if(x1 >= 0 && x1 < N && y1 >= 0 && y1 < N && !visited[x1][y1] && map[x1][y1]){
                count++;
                dfs(x1, y1);
            }
        }
    }
}


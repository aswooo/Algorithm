import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] map;
    static boolean[][] visited;
    static int N, answer;
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());   // x축 최대 길이
        map = new char[N][N];
        visited = new boolean[N][N];
        answer = 0;
        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < N; j++){
                switch (line.charAt(j)) {
                    case 'R':
                        map[i][j] = 'R';
                        break;
                    case 'G':
                        map[i][j] = 'G';
                        break;
                    case 'B':
                        map[i][j] = 'B';
                        break;
                }
            }
        }
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]){
                    bfs(i, j, map[i][j]);
                    answer++;
                }
            }
        }
        sb.append(answer + " ");
        answer = 0;
        visited = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]){
                    errBfs(i, j, map[i][j]);
                    answer++;
                }
            }
        }
        sb.append(answer);
        System.out.println(sb.toString());

    }

    public static void bfs(int x, int y, char now){
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            for(int i = 0; i < dx.length; i++){
                int[] temp = {poll[0] + dx[i], poll[1] + dy[i]};
                if(temp[0] < 0 || temp[0] >= N || temp[1] < 0 || temp[1] >= N || visited[temp[0]][temp[1]] || now != map[temp[0]][temp[1]])
                    continue;   // 이미 방문한 적이 있거나 배열 overflow 발생시 pass
                visited[temp[0]][temp[1]] = true;
                queue.add(temp);
            }
        }
    }

    public static void errBfs(int x, int y, char now){
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            for(int i = 0; i < dx.length; i++){
                int[] temp = {poll[0] + dx[i], poll[1] + dy[i]};
                if(temp[0] < 0 || temp[0] >= N || temp[1] < 0 || temp[1] >= N || visited[temp[0]][temp[1]])
                    continue;   // 이미 방문한 적이 있거나 배열 overflow 발생시 pass
                else {
                    if((now == 'G' && map[temp[0]][temp[1]] == 'R') || (now == 'R' && map[temp[0]][temp[1]] == 'G') || now == map[temp[0]][temp[1]]){
                        visited[temp[0]][temp[1]] = true;
                        queue.add(temp);
                    }
                }
            }
        }
    }
}

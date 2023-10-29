import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] map, visited;
    static int N, M, answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());   // x축 최대 길이
        M = Integer.parseInt(st.nextToken());   // y축 최대 길이
        map = new boolean[N][M];
        visited = new boolean[N][M];
        int[] start = new int[2];
        answer = 0;
        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                switch (line.charAt(j)) {
                    case 'X':
                        visited[i][j] = true;  // 갈 수 없는 벽
                        break;
                    case '0':
                        map[i][j] = false;  // 아무도 없음
                        break;
                    case 'P':
                        map[i][j] = true;  // 사람만남!
                        break;
                    case 'I':
                        start = new int[]{i, j};
                        break;
                }
            }
        }
        bfs(start);
        if (answer != 0)
            System.out.println(answer);
        else {
            System.out.println("TT");
        }
    }

    public static void bfs(int[] start){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            if(map[poll[0]][poll[1]]){
                answer++;
            }
            for(int i = 0; i < dx.length; i++){
                int[] temp = {poll[0] + dx[i], poll[1] + dy[i]};
                if(temp[0] < 0 || temp[0] >= N || temp[1] < 0 || temp[1] >= M || visited[temp[0]][temp[1]])
                    continue;
                visited[temp[0]][temp[1]] = true;
                queue.add(temp);
            }
        }
    }
}

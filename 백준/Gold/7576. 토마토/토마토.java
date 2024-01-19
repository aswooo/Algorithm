import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    static int[][] arr;
    static int N, M;
    static Queue<Point> queue = new LinkedList<>();
    static int[] x_pos = {0, 1, 0, -1};
    static int[] y_pos = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());   // 가로
        N = Integer.parseInt(st.nextToken());   // 세로
        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){     // y
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++) {    // x
                arr[i][j] =  Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    queue.add(new Point(i, j));
                    visited[i][j] = true;
                }
                else if (arr[i][j] == -1) {
                    visited[i][j] = true;
                }
            }
        }
        queue.add(new Point(-1, -1));   // 날짜 변경 값
        int date = bfs();
        if (check()) {
            System.out.println(date);
        } else {
            System.out.println(-1);
        }

    }
    static class Point {
        public int x;
        public int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static int bfs(){
        int date = -1;
        while(!queue.isEmpty()){
            Point point = queue.poll();
            if(point.x < 0){
                date++;
                if(!queue.isEmpty())
                    queue.add(new Point(-1, -1));   // 날짜 변경 값
            }   // 날짜 변경의 경우
            else {
                for (int i = 0; i < 4; i++) {
                    int nx = point.x + x_pos[i];
                    int ny = point.y + y_pos[i];
                    if (nx > -1 && nx < N && ny >-1 && ny < M && !visited[nx][ny]){
                        queue.add(new Point(nx, ny));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return date;
    }

    public static boolean check(){
        for(int i = 0; i < N; i++) {     // y
            for(int j = 0; j < M; j++) {    // x
                if(!visited[i][j])
                    return false;
            }
        }
        return true;
    }
}

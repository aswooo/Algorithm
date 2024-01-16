import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static boolean[][] arr;
    static int N, M, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());   // 국가의 수
            M = Integer.parseInt(st.nextToken());   // 비행기의 종류
//            arr = new boolean[N + 1][N + 1];
//            visited = new boolean[N + 1];
//            int answer = 0;

            for(int j = 0; j < M; j++){
                st = new StringTokenizer(br.readLine(), " ");
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
//                arr[n][m] = arr[m][n] = true;
            }
            System.out.println(N-1);
        }
    }
/*    public static void bfs(int now){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(now);
        visited = new boolean[visited.length];
        visited[0] = true;
        visited[now] = true;
        count = -1;
        while(!queue.isEmpty()){
            count++;
            int temp = queue.poll();
            visited[temp] = true;
            if(check())
                break;
            for(int i = 1; i < N + 1; i++){
                if(arr[i][temp])
                    queue.add(i);
            }
        }
    }

    public static boolean check(){
        for(boolean b : visited){
            if (!b)
                return false;
        } // 방문하지 않은 곳이 있다면 false 반환
        return true;
    }*/
}

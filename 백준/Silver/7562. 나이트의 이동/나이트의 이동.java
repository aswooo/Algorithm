import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());   // 테스트 케이스의 개수

        for(int i = 0; i < t; i++){ // 테스트 케이스만큼 반복
            int l = Integer.parseInt(br.readLine()) - 1;   // 체스판 한 변의 길이
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] start = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0};     // 시작 위치
            st = new StringTokenizer(br.readLine(), " ");
            int[] target = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};    // 목표 위치
            bfs(l, start, target);
        }
    }

    public static void bfs(int l, int[] start, int[] target){
        Queue<int[]> queue = new LinkedList<>();
        int answer = 1;
        boolean[][] visited = new boolean[l + 1][l + 1];
        queue.add(start);

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            if(poll[0] == target[0] && poll[1] == target[1]){
                System.out.println(poll[2]);
                break;
            }
            for(int i = 0; i < dx.length; i++){
                int[] temp = {poll[0] + dx[i], poll[1] + dy[i], poll[2] + 1};
                if(temp[0] < 0 || temp[0] > l || temp[1] < 0 || temp[1] > l || visited[temp[0]][temp[1]])
                    continue;
                visited[temp[0]][temp[1]] = true;
                queue.add(temp);
            }
            answer++;
        }
    }
}

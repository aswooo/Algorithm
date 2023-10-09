import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int answer = 0;
    static boolean[] visited;
    static int N, M;
    static LinkedList<LinkedList<Integer>> array;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        array = new LinkedList<LinkedList<Integer>>();
        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수

        visited = new boolean[N + 1];
        for(int i = 0; i < N + 1; i++){
            array.add(new LinkedList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            array.get(x).add(y);
            array.get(y).add(x);
        }
        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                answer++;
                dfs(i);
            }
        }

        System.out.println(answer);
    }
    
    public static void dfs(int x){
        for(int i = 0; i < array.get(x).size(); i++){
            visited[x] = true;
            if(!visited[array.get(x).get(i)]){
                dfs(array.get(x).get(i));
            }
        }
    }
}

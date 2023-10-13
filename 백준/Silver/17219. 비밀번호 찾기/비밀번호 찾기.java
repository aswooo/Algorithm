import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 저장 사이트의 수
        int M = Integer.parseInt(st.nextToken()); // 찾으려는 사이트의 수
        HashMap<String, String> list = new HashMap<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            list.put(st.nextToken(), st.nextToken());
        }
        for(int i = 0; i < M; i++){
            System.out.println(list.get(br.readLine()));
        }
    }
}


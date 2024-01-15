import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> score = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= N; i++){
            score.add(Integer.parseInt(br.readLine()) - 1, i);
        }
        for(int i = score.size(); i > M; i--){
            score.remove(score.size() - 1);
        }
        for(int i = score.size(); i > 0; i--){
            answer.add(Integer.parseInt(br.readLine()) - 1, score.get(i - 1));
        }
        for(int i = 0; i < 3; i++){
            System.out.println(answer.get(i));
        }
    }
}

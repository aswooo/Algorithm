import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        HashMap<String, Boolean> map = new HashMap<>();


        for(int i = 0; i < N; i++){
            map.put(br.readLine(), true);
        }
        for(int i = 0; i < M; i++){
            String temp = br.readLine();
            if(map.getOrDefault(temp, false)){
                answer.add(temp);
            }
        }
        answer.sort(Comparator.naturalOrder());
        System.out.println(answer.size());
        for(String temp: answer)
            System.out.println(temp);
    }
}

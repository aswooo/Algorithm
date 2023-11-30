import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 수강 가능 인원
        int M = Integer.parseInt(st.nextToken()); // 대기목록의 길이
        int count = 0;
        LinkedHashSet<String> list = new LinkedHashSet<>();
        for(int i = 0; i < M; i++){
            String temp = br.readLine();
            if(list.contains(temp))
                list.remove(temp);
            list.add(temp);
        }
        for(String temp: list){
            count++;
            System.out.println(temp);
            if(count == N)
                break;
        }
    }
}


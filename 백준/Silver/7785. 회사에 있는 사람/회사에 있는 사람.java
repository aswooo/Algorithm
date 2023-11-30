import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine()); // 출입기록의 수
        HashSet<String> list = new HashSet<>();
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String stat = st.nextToken();
            if(stat.equals("enter"))
                list.add(name);
            else if(stat.equals("leave"))
                list.remove(name);
        }
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}


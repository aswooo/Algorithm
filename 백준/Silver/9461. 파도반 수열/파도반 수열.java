import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Long> numbers = new ArrayList<>();
    static int N;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //st = new StringTokenizer(br.readLine(), "");
        N = Integer.parseInt(br.readLine()); // 가로, 세로
        numbers.add(1L);
        numbers.add(1L);
        numbers.add(1L);
        numbers.add(2L);
        numbers.add(2L);
        int num;
        for(int i = 0; i < N; i++){
            num = Integer.parseInt(br.readLine());
            for(int j = numbers.size(); j <= num; j++) {
                numbers.add((numbers.get(j - 1) + numbers.get(j - 5)));
            }
            System.out.println(numbers.get(num-1));
        }

    }
}


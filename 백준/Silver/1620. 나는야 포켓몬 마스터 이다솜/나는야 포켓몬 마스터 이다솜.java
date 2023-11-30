import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 종류의 수
        int M = Integer.parseInt(st.nextToken()); // 문제의 수
        HashMap<String, Integer> numList = new HashMap<>();
        HashMap<Integer, String> stringList = new HashMap<>();
        for(int i = 1; i <= N; i++){
            String name = br.readLine();
            numList.put(name, i);
            stringList.put(i, name);
        }
        for(int i = 0; i < M; i++){
            String temp = br.readLine();
            if (Character.isDigit(temp.charAt(0))) {
                System.out.println(stringList.get(Integer.parseInt(temp)));
            } else {
                System.out.println(numList.get(temp));
            }
        }
    }
}


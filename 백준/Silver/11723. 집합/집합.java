import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<Integer> list = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()){
                case "add":
                    list.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    list.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    if (list.contains(Integer.parseInt(st.nextToken()))) {
                        sb.append(1 + "\n");
                    } else {

                        sb.append(0 + "\n");
                    }
                    break;
                case "toggle":
                    int t = Integer.parseInt(st.nextToken());
                    if (list.contains(t)) {
                        list.remove(t);
                    } else {
                        list.add(t);
                    }
                    break;
                case "all":
                    list.clear();
                    for(int j = 1; j <= 20; j++){
                        list.add(j);
                    }
                    break;
                case "empty":
                    list.clear();
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}



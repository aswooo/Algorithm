import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int answer = 0;

        while(n>=2 && m>=1 && m+n >=3+k){
            n = n-2;
            m= m-1;
            answer++;
        }
        System.out.println(answer);
    }
}

//st = new StringTokenizer(br.readLine(), " ");

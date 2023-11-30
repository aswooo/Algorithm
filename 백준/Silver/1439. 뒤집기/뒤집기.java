import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int now = 3;
        int one = 0;
        int zero = 0;

        for (char temp : br.readLine().toCharArray()) {
            if (now != temp) {
                now = temp;
                if (now == 48)
                    one++;
                else
                    zero++;
            }
        }
        int answer = one;
        if(answer > zero)
            answer = zero;
        System.out.println(answer);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = N / 5;
        int weight = N % 5;

        while(weight != N || weight % 3 == 0){
            if(weight % 3 == 0){
                count += weight / 3;
                weight = 0;
                break;
            }
            else {
                count--;
                weight += 5;
            }
        }
        if(weight == N)
            count = -1;

        System.out.println(count);
    }
}

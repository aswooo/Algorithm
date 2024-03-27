import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String string = br.readLine() + " ";
        String token  = br.readLine();
        StringTokenizer st = new StringTokenizer(string, token);
        answer = string.split(token).length - 1;


        System.out.println(answer);
    }
}
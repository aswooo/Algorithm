import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int line = 1;

        while (x > line) {
            x -= line;
            line++;
        }
        if (line % 2 == 0)
            System.out.println(x + "/" + (line - x + 1));
        else
            System.out.println(line - x + 1 + "/" + x);
    }
}

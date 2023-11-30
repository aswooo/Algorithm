import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<String> stack = new Stack<>();
        int N = Integer.parseInt(st.nextToken()); //
        int answer = 0;

        for(int i = 0; i < N; i++){
            String temp = br.readLine();
            if(temp.equals("0"))
                stack.pop();
            else
                stack.add(temp);
        }
        while(!stack.isEmpty()){
            answer += Integer.parseInt(stack.pop());
        }
        System.out.println(answer);
    }
}


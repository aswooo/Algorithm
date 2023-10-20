import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {   //프로그램의 시작부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int now = 1;
        ArrayList<String> answer = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            while(now <= num){
                stack.push(now++);
                answer.add("+");
            }
            if(stack.peek() == num){
                stack.pop();
                answer.add("-");
            }
            else{
                answer.clear();
                break;
            }
        }
        if(answer.isEmpty()) {
            System.out.println("NO");
            }
        else
        {
            for(String temp: answer){
                System.out.println(temp);
            }
        }
    }
}

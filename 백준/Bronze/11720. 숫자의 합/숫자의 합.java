import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        String[] number = br.readLine().split("");
        for(int i = 0; i < N; i++){
            answer += Integer.parseInt(number[i]);
        }
        System.out.println(answer);
    }
}

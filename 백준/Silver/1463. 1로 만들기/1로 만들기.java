import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] arr = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 1;
        for(int i = 4; i <= N; i++){ // 4부터 시작
            arr[i] = Math.min(num(i), arr[i-1] + 1);
        }
        System.out.println(arr[N]);
    }

    public static int num(int i){
        if(i % 6 == 0){
            return Math.min(arr[i/2], arr[i/3]) + 1;
        }
        else if(i % 2 == 0){
            return arr[i/2] + 1;
        }
        else if(i % 3 == 0){
            return arr[i/3] + 1;
        }
        else{
            return num(i - 1) + 1;
        }
    }
}




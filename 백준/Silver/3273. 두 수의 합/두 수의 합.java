import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] array = new long[N];
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Long x =  Long.parseLong(br.readLine());

        for(int i = 0; i < N; i++){
            array[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if(Arrays.binarySearch(array, x - array[i]) >= 0)
                answer++;
        }
        System.out.println(answer/2);
    }
}

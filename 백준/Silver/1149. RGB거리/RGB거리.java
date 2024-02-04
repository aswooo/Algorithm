import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] array;
    static int[][] minArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        array = new int[N][3];
        minArr = new int[N][3];
        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int j = 0; j < 3; j++) {
             minArr[0][j] = array[0][j];
        }
        for(int i = 1; i < N; i++){
            for(int j = 0; j < 3; j++) {
                min(i, j);
            }
        }
        System.out.println(Math.min(Math.min(minArr[N-1][0], minArr[N-1][1]), minArr[N-1][2]));
    }
    public static void min(int line, int house){
        for(int i = 0; i < 3; i++){
            if(house != i)
                if(minArr[line][i] == 0)
                    minArr[line][i] = minArr[line-1][house] + array[line][i];
                else
                    minArr[line][i] = Math.min(minArr[line][i], minArr[line-1][house] + array[line][i]);
        }
    }
}

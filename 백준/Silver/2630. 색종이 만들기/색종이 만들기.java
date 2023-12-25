import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] array;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        array = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, N);
        System.out.println(new StringBuilder().append(white).append("\n").append(blue).toString());
    }
    public static boolean check(int x, int y, int size){
        int temp = array[x][y];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(array[x + i][y + j] != temp)
                    return false;
            }
        }
        return true;
    }// 전체 체크

    public static void divide(int x, int y, int size){
        if(check(x, y, size)){
            if(array[x][y] == 1)
                blue++;
            else
                white++;
        }   // 모두 색이 같을 경우
        else {
            divide(x, y, size/2);                       // 상좌
            divide(x, y + size/2, size/2);           // 상우
            divide(x + size/2, y, size/2);           // 하좌
            divide(x + size/2, y + size/2, size/2);   // 하우
        }   // 색이 다를 경우 나눠야함
    }
}



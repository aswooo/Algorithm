import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
            int N = triangle.length;
            int M = triangle[triangle.length - 1].length;
            int[][] array = new int[N][M];
            array[0][0] = triangle[0][0];
            for(int i = 1; i < N; i++){
                for(int j = 0; j < triangle[i].length; j++){
                    if(j - 1 >= 0 && array[i-1].length > j - 1) {   // 인덱스가 0이 아닐 경우
                        array[i][j] = array[i-1][j-1] + triangle[i][j];
                    }
                    if(triangle[i-1].length > j) {
                        array[i][j] = Math.max(array[i][j], array[i-1][j] + triangle[i][j]);
                    }
                    answer = Math.max(answer, array[i][j]);
                }
            }
            return answer;
    }
}
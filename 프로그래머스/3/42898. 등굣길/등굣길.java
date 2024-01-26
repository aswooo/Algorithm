class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] array = new int[n+1][m+1];
            array[1][1] = 1;
            for(int[] puddle: puddles){
                array[puddle[1]][puddle[0]] = -1;
            }
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if(array[i][j] != -1){
                        if(array[i-1][j] > 0)
                            array[i][j] += array[i-1][j] % 1000000007;
                        if(array[i][j-1] > 0)
                            array[i][j] += array[i][j-1] % 1000000007;
                    }
                }
            }
            return array[n][m] % 1000000007;
    }
}
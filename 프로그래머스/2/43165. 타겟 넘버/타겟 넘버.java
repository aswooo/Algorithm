class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    public void dfs(int[] numbers, int target, int depth, int result){   
        if(depth == numbers.length){
            if(result == target){
                answer++;
            }
        }
        else{
            int add = result + numbers[depth];
            int sub = result - numbers[depth];
            depth++;
            dfs(numbers, target, depth, add);
            dfs(numbers, target, depth, sub);
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//     int answer = 0;
//             answer = dfs(numbers, 0, answer, target, 0);
//             return answer;
//         }

//         public int dfs(int[] numbers, int depth, int answer, int target, int count){
//             int add = answer + numbers[depth];
//             int sub = answer - numbers[depth];

//             depth++;
//             if(numbers.length == depth){
//                 if(add == target || sub == target)
//                     count++;
//                 return count;
//             }
//             else{
//                 count = dfs(numbers, depth, add, target, count);
//                 count = dfs(numbers, depth, sub, target, count);
//             }
//             return count;
//         }
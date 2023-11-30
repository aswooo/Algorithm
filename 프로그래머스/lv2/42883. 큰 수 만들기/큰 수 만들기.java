import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String number, int k) {
//         StringBuilder answer = new StringBuilder("");
//         int i = 0;
//         int index = 0;
//         int len = number.length() - k;

//         while(k > 0 && len != answer.length()){
//             index = maxIndex(number.substring(i, i+k+1));
//             answer.append(number.charAt(i + index));
//             k -= index; i += index + 1;
//         }
//         if(len != answer.length())
//             answer.append(number.substring(i));

//         return answer.toString();
//     }

//     public int maxIndex(String list){
//         String[] t = list.split("");
//         int max = 0;
//         for(int i = 1; i < t.length; i++)
//             if(t[max].compareTo(t[i]) < 0)
//                 max = i;
//         return max;
//     }
        StringBuilder answer = new StringBuilder("");
        int len = number.length() - k;
        int start = 0;
        
        while(start < number.length() && answer.length() != len) {
            int leftNum = k + answer.length() + 1;
            int max = 0;
            for (int j = start; j < leftNum; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    start = j + 1;
                }
            }
            answer.append(Integer.toString(max));
        }
        return answer.toString();
    }
}
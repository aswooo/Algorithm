import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] array = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            array[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });
        if(Integer.parseInt(array[0]) == 0)
            return "0";
        
        StringBuilder builder = new StringBuilder();
        for(String j: array){
            builder.append(j);
        }
        String answer = builder.toString(); 
        return answer;
    }
}

// https://velog.io/@aswooo/programmers-정렬-가장-큰-수
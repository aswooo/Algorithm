//import java.util.Arrays;
//
//class Solution {
//    public boolean solution(String[] phone_book) {
//        Arrays.sort(phone_book);
//        boolean answer = true;
//
//        int j = 1;
//        for(String num: phone_book){
//            for(int i=j; i<phone_book.length; i++){
//                if (phone_book[i].startsWith(num)){
//                    answer = false;
//                }
//            }
//            j++;
//        }
//        return answer;
//    }
//}

// ---

//import java.util.Arrays;
//
//class Solution {
//    public boolean solution(String[] phone_book) {
//        Arrays.sort(phone_book);
//        boolean answer = true;
//        for(int i=0; i<phone_book.length-1; i++){
//            if (phone_book[i+1].startsWith(phone_book[i])){
//                answer = false;
//            }
//        }
//        return answer;
//    }
//}

import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        int i = 0;
        for(String temp: phone_book){
            map.put(temp, i);
            i++;
        }

        for(i = 0; i<phone_book.length; i++){
            for(int j = 0; j < phone_book[i].length(); j++){
                if (map.containsKey(phone_book[i].substring(0, j))){
                    return false;
                }
            }
        }
        return true;
    }
}
// https://velog.io/@aswooo/Programmers-Hash-전화번호-목록

import java.util.Arrays;
import java.util.HashMap;

//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for(int i = 0; i < participant.length; i++){
//            if (completion[i].equals(participant[i])){}
//            else
//                return participant[i];
//        }
//        return null;
//    }
//}
// 효율성 탈락


class Solution {
    public String solution(String[] participant, String[] completion) {

        String answer = new String();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String name : participant) map.put(name, map.getOrDefault(name, 0) + 1);
        for(String name : completion) map.put(name, map.get(name) - 1);

        for(String name : map.keySet()) {
            if(map.get(name) != 0) {
                answer = name;
                break;
            }
        }

        return answer;
    }
}

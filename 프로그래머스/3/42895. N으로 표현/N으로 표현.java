import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    List<Set<Integer>> list = new ArrayList<>();
    public int solution(int N, int number) {
        StringBuilder sb = new StringBuilder().append(N);
        if(N == number)
            return 1;
        for(int i = 0; i < 9; i++)
            list.add(new HashSet<Integer>());
        list.get(1).add(Integer.valueOf(sb.toString()));

        for(int i = 2; i < 9; i++){
            Set<Integer> nowSet = list.get(i);
            for(int j = 1; j < i; j++){
                Set<Integer> set = list.get(j);
                Set<Integer> revSet = list.get(i - j);
                for(int s: set){
                    for(int r: revSet){
                        nowSet.add(s + r);
                        nowSet.add(s - r);
                        nowSet.add(s * r);
                        if(s != 0 && r != 0)
                            nowSet.add(s / r);
                    }
                }
            }
            nowSet.add(Integer.parseInt(sb.append(N).toString()));
            if(nowSet.contains(number))
                return i;
        }
        return -1;
    }
}
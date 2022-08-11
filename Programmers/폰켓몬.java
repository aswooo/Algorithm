import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int max = (nums.length) / 2;
        HashSet<Integer> arr = new HashSet<Integer>();
        for(int i : nums){
            arr.add(i);
        }
        if(arr.size() < max)
            return arr.size();
        else
            return max;
    }
}



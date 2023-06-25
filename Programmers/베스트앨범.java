import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
                ArrayList<Integer> answer = new ArrayList<>();

        HashMap<String, Integer> total = new HashMap<String, Integer>(); // 장르별 플레이 횟수
        HashMap<Integer, ArrayList<Integer>> number = new HashMap<Integer, ArrayList<Integer>>(); // 플레이수에 따른 노래의 고유 번호
        HashMap<String, ArrayList<Integer>> play = new HashMap<String, ArrayList<Integer>>(); // 장르에 따라 플레이 횟수 저장으
        //List<Integer> count = new ArrayList<Integer>();

        for(int i = 0; i< genres.length; i++){
            ArrayList<Integer> count = new ArrayList<Integer>(plays[i]);
            ArrayList<Integer> list = new ArrayList<Integer>();
            total.put(genres[i], total.getOrDefault(genres[i], 0) + plays[i]);  // 장르별 플레이 수
            //number.put(plays[i], i);    // 플레이별 고유번호 (플레이 수로 번호 찾기 가능)

            if(number.get(plays[i]) == null)
                list.add(i);
            else {
                list = number.get(plays[i]);
                list.add(i);
            }
            list.sort(Comparator.naturalOrder());
            number.put(plays[i], list);

            if(play.get(genres[i]) == null)
                count.add(plays[i]);
            else {
                count = play.get(genres[i]);
                count.add(plays[i]);

            }
            play.put(genres[i], count); // 장르별 카운트 횟수
        }
        List<String> keySet = new ArrayList<>(total.keySet());
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return total.get(o1).compareTo(total.get(o2));
            }
        });
        keySet.sort((o1, o2) -> total.get(o2).compareTo(total.get(o1)));  // 장르별로 줄 세움
        for (String key : keySet) { // 장르의 갯수 만큼 반복
            List<Integer> temp =  play.get(key);
            temp.sort(Collections.reverseOrder());
            for(int t = 0; t < temp.size() && t < 2;){
                for(Integer j : number.get(temp.get(t))){
                    answer.add(j);
                    t++;
                    if(t == 2)
                        break;
                }
            }
        }
         return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
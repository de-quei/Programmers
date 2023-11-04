import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                //list에 중복 값이 존재하지 않다면
                if (!list.contains(numbers[i] + numbers[j])) {
                    //리스트에 값을 추가함
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        //리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        //오름차순 정렬
        Arrays.sort(answer);
        
        //같은결과
        //return list.stream().sorted().mapToInt(i -> i).toArray();
        //sorted로 오름차순 정렬
        //mapToInt로 int형으로 변환
        //toArray로 배열로 변환
        
        return answer;
    }
}

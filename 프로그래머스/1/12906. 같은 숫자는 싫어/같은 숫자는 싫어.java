import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        //arr의 원소는 0~9까지이므로 어느것에도 속하지 않는 -1이 기준
        int value = -1;
        
        for(int i = 0; i < arr.length; i++){
            //배열의 요소가 value와 다르다면
            if(arr[i] != value){
                //리스트에 추가하고 value를 업데이트
                answerList.add(arr[i]);
                value = arr[i];
            }
        }
        
        //ArrayList를 int형 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
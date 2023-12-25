import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(n); //초기 수 n은 미리 넣어둔다.
        
        while(n != 1){ //x가 1이 될때까지 반복
            if(n%2 == 0) n /= 2;
            else n = 3 * n + 1;
            list.add(n);
        }
        
        //answer배열에 list의 값을 가져와 할당한다.
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
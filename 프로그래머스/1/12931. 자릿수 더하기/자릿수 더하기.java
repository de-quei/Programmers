import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n); //숫자를 문자열로
        String[] num = s.split(""); //문자 단위로 split하여 배열에 저장
        
        for(int i = 0; i < num.length; i++){
            answer += Integer.parseInt(num[i]); //각 문자를 숫자형으로 변환하여 answer에 누적
        }

        return answer;
    }
}
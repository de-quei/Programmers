import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String answer = "";
        String[] str = Long.toString(n).split(""); //문자열 배열에 문자로 할당
        
        Arrays.sort(str, Collections.reverseOrder()); //str을 이용하여 reverseOrder.
        
        for(String s : str) answer += s; //answer에 str을 누적
        
        
        return Long.parseLong(answer); //문자열을 Long 타입으로 변환하여 return
    }
}
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str); //문자 오름차순 정렬
        
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < str.length; i++){
            sb.append(str[i]); //sb에 str[i]를 덧붙인다.
        }
        
        //내림차순 정렬 후, 문자열로 바꿔준다.
        return sb.reverse().toString();
    }
}
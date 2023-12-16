class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        //s의 길이가 4, 6이 아닐 시 false 
        if(s.length() != 4 && s.length() != 6) answer = false;
        
        //s가 0~9가 아니라면 false
        //아스키코드로 하면 48~57
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9') answer = false;
        }
        return answer;
    }
}
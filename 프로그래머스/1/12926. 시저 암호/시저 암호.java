class Solution {
    public String solution(String s, int n) {
        //A == 65 / a == 97
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                answer += " ";
            }
            //대문자라면
            else if(ch >= 65 && ch <= 90){
                if(ch + n > 'Z'){
                    answer += (char)(ch-26+n);
                }else{
                    answer += (char)(ch+n);
                }
            }
            //소문자라면
            else if(ch >= 97 && ch <= 122){
                if(ch + n > 'z'){
                    answer += (char)(ch-26+n);
                }else{
                    answer += (char)(ch+n);
                }
            }
        }
        return answer;
    }
}
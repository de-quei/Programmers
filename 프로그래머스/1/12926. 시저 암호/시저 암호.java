class Solution {
    public String solution(String s, int n) {
        //A == 65 / a == 97 (아스키코드)
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            //공백이라면 똑같이 공백 추가
            if(ch == ' '){
                answer += " ";
            }
            //대문자라면
            else if(ch >= 65 && ch <= 90){
                //만약 Z를 넘으면
                if(ch + n > 90){
                    //다시 앞부터 + n
                    answer += (char)(ch - 26 + n);
                }else{
                    answer += (char)(ch + n);
                }
            }
            //소문자라면
            else if(ch >= 97 && ch <= 122){
                //만약 z를 넘으면
                if(ch + n > 122){
                    //다시 앞부터 + n
                    answer += (char)(ch - 26 + n);
                }else{
                    answer += (char)(ch + n);
                }
            }
        }
        return answer;
    }
}

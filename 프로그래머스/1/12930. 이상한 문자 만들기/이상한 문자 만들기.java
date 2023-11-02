class Solution {
    public String solution(String s) {
        //짝수번째는 대문자 / 홀수번째 소문자 / 공백도 포함
        String answer = "";
        //문자열과 단어의 관계에서는 split을 이용할 것
        String[] str = s.split("");
        int idx = 0;
        
        for(int i = 0; i < str.length; i++){
            //공백이라면 idx는 0
            if(str[i].equals(" ")) {
                idx = 0;
            } 
            //idx가 짝수라면 대문자
            else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } 
            //idx가 홀수라면 소문자
            else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            //answer에 누적
            answer += str[i];
        }
        return answer;
    }
}
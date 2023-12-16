class Solution {
    public String solution(String s) {
        String answer = "";
        int mid = s.length() / 2; //가운데 위치 지정
        
        for(int i = 0; i < s.length(); i++){
            if(s.length() % 2 == 0) answer = s.substring(mid-1, mid+1); //문자열 길이가 짝수라면 가운데 두 글자 추출
            else answer = s.substring(mid, mid + 1); //문자열 길이가 홀수라면 가운데 한 글자 추출
        }
        return answer;
    }
}

class Solution {
    public String solution(int[] numLog) {
        //숫자의 배열을 보고 wasd를 return하는 것
        String answer = "";
        
        //numLog 길이만큼 반복
        for(int i = 1; i < numLog.length; i++){
            if(numLog[i] - numLog[i - 1] == 1) answer += "w"; //해당 인덱스의 수와 전 인덱스의 차가 1이면 w 삽입
            else if(numLog[i] - numLog[i - 1] == -1) answer += "s"; 
            else if(numLog[i] - numLog[i - 1] == 10) answer += "d";
            else if(numLog[i] - numLog[i - 1] == -10) answer += "a";
        }
        return answer;
    }
}
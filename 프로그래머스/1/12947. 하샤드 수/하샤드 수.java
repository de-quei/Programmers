class Solution {
    public boolean solution(int x) {
        String num = Integer.toString(x); //x를 문자열로 할당
        String[] n = num.split(""); //n 배열에 num을 문자 단위로 나누어 각 인덱스방에 저장
        int sum = 0;
        boolean answer = true;
        
        for(int i = 0; i < n.length; i++){
            //문자인 n[i]를 정수형으로 변환하여 sum에 누적
            sum += Integer.parseInt(n[i]);
        }
        
        if(x % sum == 0)
            answer = true;
        else
            answer = false;
        
        
        return answer;
    }
}
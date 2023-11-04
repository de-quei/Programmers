class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt = 0;
        
        //1이 될때까지 반복
        while(num != 1){
            if(num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
            answer++; //횟수 추가
            
            //500번을 넘어가면 -1 할당
            if(answer >= 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
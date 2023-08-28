class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        //x부터 시작해서 x씩 증가하는 숫자를 n개 지녀야 함.
        for(int i = 0; i < n; i++) {
            //answer가 long이기 때문에 long으로 type casting 해줄 것.
            answer[i] = (long)(i+1) * x;
        }

        return answer;
    }
}
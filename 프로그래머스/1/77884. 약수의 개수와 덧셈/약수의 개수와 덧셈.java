class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        //left부터 right까지
        for(int i = left; i <= right; i++) {
            int cnt = 0; //약수의 개수를 카운트
            //약수를 구하는 알고리즘
            //1부터 본인(수)까지 반복할때 본인/(1~본인)이 0이면 약수
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cnt++;
            }
            
            if(cnt % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
}
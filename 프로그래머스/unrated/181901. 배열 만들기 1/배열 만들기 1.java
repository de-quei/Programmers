class Solution {
    public int[] solution(int n, int k) {
        //예를들어
        //n = 10, k = 3이면
        //10 이하의 3의 배수를 배열에 담아 출력한다.
        
        //배열 크기 지정
        int cnt = n / k;
        int[] answer = new int[cnt];

        for(int i = 0; i < cnt; i++){
            answer[i] = k * (i + 1);
        }
        
        return answer;
    }
}
class Solution {
    public long solution(long n) {
        //answer에 n의 제곱근을 할당
        //n이 121이라면 11을 할당
        long answer = (long)Math.sqrt(n);
        
        //n과 answer의 제곱이 같다면 answer+1의 제곱을 리턴
        if(n == Math.pow(answer, 2)) return (long)Math.pow(answer+1, 2);
        else return -1;
        
    }
}
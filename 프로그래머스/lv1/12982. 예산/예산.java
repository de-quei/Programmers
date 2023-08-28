import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        //예산을 오름차순 정렬
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            sum += d[i];
            //만약 필요금액의 합이 예산보다 크다면 
            //지원가능한 부서의 수는 i
            if(sum > budget){
                answer = i;
                break;
            }
        }
        
        //만약 다 합해도 예산보다 작거나 같다면 모든 부서 지원 가능
        if(sum <= budget) answer = d.length;
        return answer;
    }
}
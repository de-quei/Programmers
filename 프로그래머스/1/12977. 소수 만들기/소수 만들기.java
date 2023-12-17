class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        boolean chk = false;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    //nums배열 중 서로다른 3개의 수를 더한 값을 sum에 할당
                    sum = nums[i] + nums[j] + nums[k];
                    //sum에 대한 소수 판별을 chk에 할당하고,
                    chk = sosu(sum);
                    //sum이 소수라면 answer을 증가시킨다.
                    if(chk == true) answer++;
                }
            }
        }
        
        return answer;
    }
    //소수를 판별하는 메소드
    public boolean sosu(int sum){
        boolean check = true; 
        if(sum == 2) return check;
        for(int i = 2; i < sum; i++){
            if(sum%i == 0){
                check = false;
                break;
            }
        }
        return check;
    }
}
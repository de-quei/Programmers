class Solution {
    public long solution(int price, int money, int count) {
        // price = 3인 놀이기구를 4번타고 싶은 고객이 가진 금액이 20이라면
        // 놀이기구 이용료 3 + (3*2) + (3*3) + (3*4) = 30
        // 이용료 - 가진 금액 = return값
        long answer = 0;
        long sum = 0;
        
        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
        
        if(sum > money)
            return sum - money;
        else
            return 0;
        
    }
}
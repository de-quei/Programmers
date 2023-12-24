class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //n부터 수가 점차 작아지게 반복문을 돌린다.
        for(int i = n; i > 0; i--){
            if(n%i == 1){ //만약 나머지가 1이라면
                answer = i; //answer에 i를 할당함.
            }
        }
        return answer; //min 변수를 쓰지 않더라도 할 수 있는 방법
    }
}
class Solution {
    public String solution(int n) {
        String answer = "";
        
        // for(int i = 1; i <= n; i++){
        //     if(i%2 != 0){
        //         answer += "수";
        //     }else {
        //         answer += "박";
        //     }
        // }

        //단순 if~else는 3항 연산자 사용해도 좋을듯!
        for(int i = 1; i <= n; i++){
            answer += (i%2 != 0) ? "수" : "박";
        }
        return answer;
    }
}

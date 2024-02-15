class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        //food[0]은 물을 나타내므로 i는 1부터 시작함.
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++){
                sb.append(i);
            }
        }
        
        // StringBuilder를 String으로 변환하고 물을 배치 후 뒤집어 배치한 것을 추가한다.
        answer = sb.toString() + "0" + sb.reverse().toString();
        
        return answer;
    }
}
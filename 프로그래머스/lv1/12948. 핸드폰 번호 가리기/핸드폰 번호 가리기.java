class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray();
        
        //만약 01029523435라면 문자길이 -4
        for(int i = 0; i < arr.length; i++){
            if(i < arr.length - 4) answer += "*";
            else answer += arr[i];
        }
        return answer;
    }
}
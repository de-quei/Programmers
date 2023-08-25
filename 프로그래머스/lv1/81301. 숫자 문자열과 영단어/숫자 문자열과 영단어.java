class Solution {
    public int solution(String s) {
        //영단어 표 배열
        String[] str = {"zero", "one", "two", "three", "four", 
                        "five", "six", "seven", "eight", "nine"};
        
        //str 길이만큼 반복 (모든 영단어를 검사한다.)
        for(int i = 0; i < str.length; i++){
            //만약 s가 arr[i]를 포함하고 있으면
            if(s.contains(str[i]))
                //s에 arr[i]영단어를 숫자문자열로 바꿔준다 (ex. "three" -> "3")
                s = s.replace(str[i], Integer.toString(i));
        }
        //문자열을 정수로 다시 바꿔줌 ("312" -> 312)
        return Integer.parseInt(s);
    }
}
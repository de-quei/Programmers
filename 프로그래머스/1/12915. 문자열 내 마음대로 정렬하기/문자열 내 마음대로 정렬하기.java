import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 각 단어 맨 앞에 n번째 인덱스의 글자를 붙여 오름차순 정렬한 후, 잘라내는 방법 이용
        
        // 예를 들어 ["sun", "bed", "car"]라면
        // 각 n번째 인덱스의 글자를 맨 앞에 붙여
        // ["usun", "ebed", "acar"]로 변형한다.
        for(int i = 0; i < strings.length; i++){
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        
        // 변형한 문자열 배열을 오름차순 정렬한다.
        // 결과는 ["acar", "ebed", "usun"]
        Arrays.sort(strings);
        
        // 정렬을 위해 붙였던 문자열을 다시 제거 후 문자열 배열을 리턴한다.
        // 결과는 ["car", "bed", "sun"]
        for(int i = 0; i < strings.length; i++){
            strings[i] = strings[i].substring(1);
        }
        
        return strings;
    }
}
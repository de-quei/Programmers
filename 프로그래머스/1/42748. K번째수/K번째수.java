import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // answer 방의 크기는 commands의 크기와 동일하게 할당.
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            // range 방의 크기는 슬라이스 범위
            int[] range = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                // range의 용도는 commands[i][0] ~ commands[i][1]을 슬라이스한 범위를 할당
                range[j - commands[i][0] + 1] = array[j];
            }
            // 자른 범위를 오름차순으로 정렬.
            Arrays.sort(range);
            // answer 배열에 commnads[i][2]번째 수를 할당.
            answer[i] = range[commands[i][2] - 1];
        }
        
        return answer;
    }
}

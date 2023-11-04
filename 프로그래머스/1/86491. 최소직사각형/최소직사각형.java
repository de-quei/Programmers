import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0; //가로 길이
        int h = 0; //세로 길이
        int w_max = 0; //가로 최대 길이
        int h_max = 0; //세로 최대 길이
        
        for(int i = 0; i < sizes.length; i++){
            //(0,0),(0,1) / (1,0),(1,1) ...
            //가로를 길게, 세로를 짧게 -> 긴 가로 방향으로 명함을 눕히는 작업
            w = Math.max(sizes[i][0], sizes[i][1]); //명함의 가로와 세로를 비교하여 더 큰 값을 가로로
            h = Math.min(sizes[i][0], sizes[i][1]); //명함의 가로와 세로르 비교하여 더 작은 값을 세로로
            w_max = Math.max(w_max, w); //각 가로 중에 가장 큰 값
            h_max = Math.max(h_max, h); //각 세로 중에 가장 큰 값
        }
        
        return answer = w_max * h_max;
    }
}
// 2중 for문을 사용해서 일일이 곱한 후에 max를 구하는 방법은 옳지 않은가?

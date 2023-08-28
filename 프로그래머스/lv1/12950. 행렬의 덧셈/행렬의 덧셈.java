class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        //answer배열 선언
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        //만약 입출력 예1을 따른다면 인덱스가 같은 것끼리 합한다.
        // arr1[0][0] + arr2[0][0] / arr1[0][1] + arr2[0][1]
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
        
    }
}
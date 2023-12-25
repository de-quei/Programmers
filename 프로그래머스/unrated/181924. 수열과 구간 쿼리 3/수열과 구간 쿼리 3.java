class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //queries의 짝과 같은 arr내 값을 서로 바꾼 후의 arr를 return한다.

        int temp = 0; // 값을 바꾸기 위한 임시 저장소
        for(int i = 0; i < queries.length; i++){
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }
}
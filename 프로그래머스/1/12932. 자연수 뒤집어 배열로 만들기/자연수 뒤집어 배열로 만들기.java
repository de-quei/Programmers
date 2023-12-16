import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
        
        //문자열 배열에 n을 문자열로 변환하여 문자단위로 쪼갠 후 할당한다.
        String[] strArr = Long.toString(n).split(""); 
        // strArr 길이 만큼의 int형 배열 선언
        int[] arr = new int[strArr.length];
        
        //arr 배열에 문자열 배열의 원소를 정수형으로 변환하여 차례로 할당한다.
        for(int i = 0; i < strArr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        
        // 다시 arr를 뒤집는다.
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }
}
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray(); //char 배열로 변환
		
		int[] number = new int[4]; // 작대기의 횟수를 저장할 배열
		
		for(int i = 0; i < input.length; i++){
			switch(input[i]){
				case '1':
					number[0]++;
					break;
				case 'I':
					number[1]++;
					break;
				case 'l':
					number[2]++;
					break;
				case '|':
					number[3]++;
					break;
				default:
					break;
			}
		}
		
		for(int i = 0; i < number.length; i++){
			System.out.println(number[i]);
		}
	}
}
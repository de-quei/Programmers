import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int result = 0; //결과, 즉 헬로빗과 같은 트랙을 수강하는 친구의 수를 저장할 변수
		
		int friends = sc.nextInt(); //친구들의 수를 입력받습니다.
		String[] track_info = new String[friends]; //친구들이 수강하고픈 트랙의 정보를 저장
		
		//친구들이 수강하고픈 트랙의 정보를 입력받습니다.
		for(int i = 0; i < friends; i++){
			track_info[i] = sc.next();
		}
		
		String hellobit_track = sc.next(); //헬로빗이 수강할 트랙 정보를 입력받습니다.
		
		for(int i = 0; i < track_info.length; i++){
			if(track_info[i].equals(hellobit_track)) result++;
		}
		
		System.out.println(result);
		
	}
}
import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt(); // 구름이의 몸무게
		int N = sc.nextInt(); // 다이어트 기간
		int[] kcal = new int[N]; //먹은 칼로리 (2차원 배열로 만들어도 괜찮을 듯)
		int[] walk = new int[N]; //걸음 횟수
		
		//먹은 칼로리와 걸음 횟수를 입력받습니다.
		for(int i = 0; i < N; i++){
			kcal[i] = sc.nextInt();
			walk[i] = sc.nextInt();
		}
		
		//조건 별 무게 변화를 기록합니다.
		for(int i = 0; i < N; i++){
			if(kcal[i] > walk[i]) { //많이 먹은 날엔
				++W;
				if(W > 80) --W;
			}
			else if(kcal[i] < walk[i]){
				--W;
				if(W < 10) ++W;
			}
		}
		
		System.out.println(W);
	}
}
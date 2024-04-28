import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt(); //수식의 개수를 입력받습니다.
		
		//수식을 저장할 공간을 1차원 배열로 나타냅니다 (리팩토링 전)
		int[] num1 = new int[number];
		String[] formula = new String[number];
		int[] num2 = new int[number];
		
		//각 값을 저장할 변수
		int result = 0;
		
		//수식을 입력받습니다.
		for(int i = 0; i < number; i++){
			num1[i] = sc.nextInt();
			formula[i] = sc.next();
			num2[i] = sc.nextInt();
		}
		
		//수식에 대한 값을 저장합니다.
		for(int i = 0; i < number; i++){
			switch(formula[i]){
				case "+":
					result += num1[i] + num2[i];
					break;
				case "-":
					result += num1[i] - num2[i];
					break;
				case "*":
					result += num1[i] * num2[i];
					break;
				case "/":
					result += num1[i] / num2[i];
					break;
			}
		}
		
		System.out.println(result);
		
	}
}
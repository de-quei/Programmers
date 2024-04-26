import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int summer_day = sc.nextInt() - 1; //여름 일 수 (1일 ~ summer_day)
		int grow_day = sc.nextInt(); //스타후르츠가 자라는데 소요되는 일 수 
		int area = sc.nextInt(); //스타후르츠를 심을 수 있는 칸
		int price = sc.nextInt(); //스타후르츠 개당 가격
		
		int starfruit = 0; //스타후르츠
		
		starfruit = ((summer_day / grow_day) * area) * price;
		
		System.out.println(starfruit);
		
	}
}
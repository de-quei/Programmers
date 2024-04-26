import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int jinwoo = sc.nextInt(); //진우
		int sunwoo = sc.nextInt(); //선우
		int day = sc.nextInt(); 	 //경과날짜
		
		for(int i = 1; i <= day; i++){
			if(i%2!=0) { //진우가 주는 날
				if((jinwoo%2) != 0) { //진우가 홀수개 가지고 있다면
					sunwoo += jinwoo/2 + 1; //하나 더 줘야함
					jinwoo -= jinwoo/2 + 1;
				}
				else { //진우가 짝수개 가지고 있다면
					sunwoo += jinwoo/2; //그냥 주기
					jinwoo -= jinwoo/2;
				} 
			} else { //선우가 주는 날
				if((sunwoo%2) != 0){ //선우가 홀수개 가지고 있다면
					jinwoo += sunwoo/2 + 1;
					sunwoo -= sunwoo/2 + 1;
				}else{ //선우가 짝수개 가지고 있다면
					jinwoo += sunwoo/2;
					sunwoo -= sunwoo/2;
				}
			}
		}
		
		System.out.println(jinwoo + " " + sunwoo);
	}
}
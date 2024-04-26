import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int required_function = sc.nextInt(); // 필요 기능 개수를 입력받습니다.
        int start_hour = sc.nextInt(); // 프로젝트를 시작한 시를 입력받습니다.
        int start_minute = sc.nextInt(); // 프로젝트를 시작한 분을 입력받습니다.
        int[] time_taken = new int[required_function]; // 한 기능 당 개발 소요 시간을 저장하는 배열
        
        // 한 기능 당 개발 소요 시간을 입력받습니다.
        for (int i = 0; i < required_function; i++) {
            time_taken[i] = sc.nextInt();
        }
        
        for (int i = 0; i < required_function; i++) {
            start_minute += time_taken[i];
            
            // 분이 60 이상인 경우
            if (start_minute >= 60) {
                start_hour += start_minute / 60; // 분을 시간으로 넘겨줍니다.
                start_minute %= 60; // 분을 60으로 나눈 나머지를 분에 저장합니다.
            }
            
            // 시간이 24 이상인 경우
            if (start_hour >= 24) {
                start_hour %= 24; // 시간을 24로 나눈 나머지를 시간에 저장합니다.
            }
        }
        
        System.out.println(start_hour + " " + start_minute);
    }
}

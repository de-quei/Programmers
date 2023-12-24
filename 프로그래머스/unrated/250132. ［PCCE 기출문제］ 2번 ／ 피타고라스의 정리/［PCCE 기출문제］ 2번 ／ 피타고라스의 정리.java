import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int)Math.pow(c, 2) - (int)Math.pow(a, 2); //b제곱 = c제곱 - a제곱

        System.out.println(b_square);
    }
}
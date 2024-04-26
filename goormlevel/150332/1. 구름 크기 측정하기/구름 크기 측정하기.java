import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int area = Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
		
		System.out.println(area);
	}
}
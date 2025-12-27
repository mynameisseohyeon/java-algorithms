import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int[] numbers = new int[3];
		
		numbers[0] = Integer.parseInt(st.nextToken());		
		numbers[1] = Integer.parseInt(st.nextToken());	
		numbers[2] = Integer.parseInt(st.nextToken());	
		
		Arrays.sort(numbers);
		
		System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
	}
}
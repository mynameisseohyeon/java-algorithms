import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // FizzBuzz
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        for(int i = 0; i < 3; i++) {
            String A = br.readLine();

            if(!A.equals("FizzBuzz") && !A.equals("Fizz") && !A.equals("Buzz")) { // 3과 5의 배수 or 3의 배수 or 5의 배수가 아닐 경우
                int num = Integer.parseInt(A);
                result = num + (3 - i);
                break;
            }
        }

        if (result % 3 == 0 && result % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (result % 3 == 0) {
            System.out.println("Fizz");
        } else if (result % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(result);
        }
    }
}
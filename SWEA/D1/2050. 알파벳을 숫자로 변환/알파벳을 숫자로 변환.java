import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
                                               
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int num = ch - 64;
            
            System.out.print(num);
            if(i != str.length() - 1) {
            	System.out.print(" ");
            }
        }                    
	}
}
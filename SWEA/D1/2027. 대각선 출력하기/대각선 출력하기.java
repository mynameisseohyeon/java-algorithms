import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		for(int i = 0; i < 5; i++) {
            StringBuilder sb = new StringBuilder("+++++");
            sb.setCharAt(i, '#');
        	System.out.println(sb);
        }
	}
}
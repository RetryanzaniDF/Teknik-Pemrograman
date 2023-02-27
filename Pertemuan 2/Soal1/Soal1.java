import java.io.*;
import java.util.*;
import java.util.regex.*; 

public class Soal1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(s.isEmpty()) 
            System.out.println("0");
        else 
        {
        	String[] S = s.split("[\\s!,?._'@]+");
        	System.out.println(S.length);
        	for(int i=0;i<S.length;i++) 
        	{
        		System.out.println(S[i]);
        	}
        }
        scan.close();
    }
}
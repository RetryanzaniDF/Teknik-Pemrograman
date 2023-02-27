import java.io.*;
import java.util.*;

public class Soal3 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String full = scan.nextLine();
        int result = 0;
        String [] finish = full.split(" ");
        switch (finish[1]) 
        {
            case "+":   result = Integer.parseInt(finish[0]) + Integer.parseInt(finish[2]);
                        break;
            case "-":   result = Integer.parseInt(finish[0]) - Integer.parseInt(finish[2]);
                        break;
            case "*":   result = Integer.parseInt(finish[0]) * Integer.parseInt(finish[2]);
                        break;
            case "/":   result = Integer.parseInt(finish[0]) / Integer.parseInt(finish[2]);
                        break;  
            case "%":   result = Integer.parseInt(finish[0]) % Integer.parseInt(finish[2]);
                        break;   
        }
        System.out.println(result);
        scan.close();
    }
}

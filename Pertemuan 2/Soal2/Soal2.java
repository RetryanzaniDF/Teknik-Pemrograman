import java.io.*;
import java.util.*;

public class Soal2 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String [] name = new String [3];
        int [] number = new int [3];
        for (int i = 0; i < 3; i++)
        {
            name[i] = input.next();
            number [i] = input.nextInt();
        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++)
        {
            System.out.printf("%-14s %03d\n", name[i], number[i]);
        }
        System.out.println("================================");
    }
}
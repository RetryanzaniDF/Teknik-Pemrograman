import java.io.*;
import java.util.*;

public class Soal1 {

    public static void main(String[] args) 
    {
        Scanner p = new Scanner(System.in);
        String s = p.nextLine();
        String[] S = s.split("['!?@_ ]");
        System.out.println(S.length);
        for(int i=0;i<S.length;i++) 
        {
            System.out.println(S[i]);
        }
        p.close();
    }
}
import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        BigInteger result1 = new BigInteger(input1);
        BigInteger result2 = new BigInteger(input2);
        System.out.println(result1.add(result2));
        System.out.println(result1.multiply(result2));
    }
}
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            String plat = sc.next();
            sum += Integer.parseInt(plat);
        }
        if ((sum - 999999) % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}

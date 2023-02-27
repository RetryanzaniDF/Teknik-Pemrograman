import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Soal4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int itemSold = sc.nextInt();
    double salary = 500000;
    double itemPrice = 50000;
    if (itemSold >= 40) {
        if (itemSold >= 80) {
            salary += 0.35 * itemPrice * itemSold;
        } else {
            salary += 0.25 * itemPrice * itemSold;
        }
    } else if (itemSold < 15) {
        salary -= 0.15 * (15 - itemSold) * itemPrice;
    }
    else {
    salary += 0.1 * itemPrice * itemSold;
    }
    System.out.println((int) salary);
  }
}
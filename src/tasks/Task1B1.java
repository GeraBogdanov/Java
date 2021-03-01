package tasks;

import java.util.Scanner;

public class Task1B1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number");
    int n = scan.nextInt();
    int a[] = new int[n + 1];
    System.out.println("Enter all the elements: ");
    for (int i = 0; i < n; i++) {
      a[i] = scan.nextInt();
    }
    for (int i: a){
      System.out.println(i);
    }
  }
}

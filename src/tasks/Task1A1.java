package tasks;

import java.util.Scanner;

public class Task1A1 {
  public static void main(String[] args) {
    System.out.println("Insert your name and press <Enter>:");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Hello "+ name);
  }
}




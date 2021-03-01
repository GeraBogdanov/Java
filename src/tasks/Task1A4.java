package tasks;

import java.util.Scanner;

public class Task1A4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String password = scanner.next();
    ComparePassword compare = new ComparePassword();
    int i = compare.comparePassword(password);
    Printer printer = new Printer();
    printer.print(i);

  }
}

class ComparePassword {
  public int comparePassword(String password) {
    int result = 0;
    String pass = "absdef334";
    if (password.equals(pass)) {
      result = 1;
    } else {
      result = -1;
    }
    return result;
  }
}

class Printer {
  public void print(int i) {
    if (i == 1) {
      System.out.println("this is right pass");
    } else {
      System.out.println("this is false pass");
    }
  }
}
package tasks;

import java.util.Random;
import java.util.Scanner;

public class Task1A3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    Random random = new Random();
    for(int i = 0; i < number; i++){
      int num = random.nextInt();
      System.out.println(num);
    }
  }
}

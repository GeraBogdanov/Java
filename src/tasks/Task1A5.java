package tasks;

public class Task1A5 {
  public static void main(String[] args) {
    int i = 0;
    for (String str : args) {
      System.out.print(str + " ");
      int number = Integer.parseInt(str);
      i += number;
    }
    System.out.println(i);
  }
}

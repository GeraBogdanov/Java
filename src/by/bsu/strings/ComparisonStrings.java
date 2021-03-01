package by.bsu.strings;

public class ComparisonStrings {
  public static void main(String[] args) {
    String s1, s2;
    s1 = "Java";
    s2 = s1;
    System.out.println("link comparison " + (s1 == "Java1"));
    s2 = new String("Java");
    System.out.println("link comparison " + (s1 == s2));
    System.out.println("value comparison " + s1.equals(s2));
  }
}

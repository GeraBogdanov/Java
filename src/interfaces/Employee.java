package interfaces;


public class Employee implements Comparable<Object> {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public final int compareTo(Object otherObject) {
    Employee other = (Employee) otherObject;
    return Double.compare(salary, other.salary);
  }
}

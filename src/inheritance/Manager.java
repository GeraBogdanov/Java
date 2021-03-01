package inheritance;

import java.util.Objects;

public class Manager extends Employee {
  private double bonus;

  /**
   * @param name   the employee's name
   * @param salary the salary
   * @param year   the hire month
   * @param day    the hire day
   */

  public Manager(String name, double salary, int year, int month, int day) {
    super(name, salary, year, month, day);
    bonus = 0;
  }

  public double getSalary() {
    double baseSalary = super.getSalary();
    return baseSalary + bonus;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (!super.equals(obj)) return false;
    Manager other = (Manager) obj;
    return bonus == other.bonus;
  }

//  @Override
//  public String toString() {
//    return super.toString() +
//            "[bonus " + bonus +
//            "]";
//
//  }

  public void setBonus(double b) {
    bonus = b;
  }
}

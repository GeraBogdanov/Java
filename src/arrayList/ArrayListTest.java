package arrayList;

import abstractClasses.Employee;
import inheritance.Manager;
import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.reflect.*;

class Foo {
  static {
    System.out.println("Foo initializing");
  }
}

public class ArrayListTest {
  public static void main(String[] args) throws Exception {
    var in = new Scanner(System.in);
    System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE");
    var boss = new Employee("Harry", 5000, 1980, 1, 8);
    String input = in.next().toUpperCase();
    Size size = Enum.valueOf(Size.class, input);
    System.out.println("size= " + size);
    System.out.println("abbreviation = " + size.getAbbreviation());
    if (size == Size.EXTRA_LARGE)
      System.out.println("good");
    size.compareTo(Size.LARGE);
    var harry = new Employee("Harry Hacker", 50000, 1989, 1, 8);
    Class cl = harry.getClass();
// the class object representing Employee
    Field f = cl.getField("name");// the name field of the Employee class
    Object v = f.get(harry);
    System.out.println(v);
  }

  public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
      this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
      return abbreviation;
    }
  }

  public static void printFields(Class cl) {
    Field[] fields = cl.getDeclaredFields();

    for (Field f : fields) {
      Class type = f.getType();
      String name = f.getName();
      System.out.print("   ");
      String modifires = Modifier.toString(f.getModifiers());
      if (modifires.length() > 0) System.out.print(modifires + "   ");
      System.out.println(type.getName() + " " + name + ";");
    }
  }
}


package inheritance;

import java.lang.reflect.Field;

public class ManagerTest {
  public static void main(String[] args) throws Exception {
    var harry = new Manager("Harry Hacker", 50000, 1989, 1, 6);
    Employee staff[] = new Employee[3];
    staff[0] = harry;
    staff[1] = harry;
    staff[2] = harry;
    Class cl = staff.getClass();
    System.out.println(cl.getComponentType());
// the value of the name field of the harry object, i.e.,
// the String object "Harry Hacker"
  }
}

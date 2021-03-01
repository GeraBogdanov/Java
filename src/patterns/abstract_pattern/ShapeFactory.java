package patterns.abstract_pattern;

import patterns.abstract_pattern.figure.Rectangle;
import patterns.abstract_pattern.figure.Square;

public class ShapeFactory extends AbstractFactory {
  /**
   *
   * @param shapeType
   * @return
   */
  @Override

  public Shape getShape(String shapeType) {
    if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    } else if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new Square();
    }
    return null;
  }
}

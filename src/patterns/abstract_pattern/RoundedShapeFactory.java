package patterns.abstract_pattern;

import patterns.abstract_pattern.figure.RoundedRectangle;
import patterns.abstract_pattern.figure.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
  @Override
  public Shape getShape(String shapeType) {
    if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new RoundedRectangle();
    } else if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new RoundedSquare();
    }
    return null;
  }
}

package patterns.abstract_pattern;

public abstract  class AbstractFactory {
  /**
   * 
   * @param shapeType
   * @return 
   */
  abstract Shape getShape(String shapeType);

}

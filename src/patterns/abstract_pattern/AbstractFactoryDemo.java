package patterns.abstract_pattern;

public class AbstractFactoryDemo {
  public static void main(String[] args){
    //get shape factory
    AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
    //get an object of Shape Rectangle
    Shape shape1 = shapeFactory.getShape("RECTANGLE");
    //call draw method of Shape Rectangle
    shape1.draw();
    Shape shape2 = shapeFactory.getShape("SQUARE");
    shape2.draw();
    AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
    Shape shape3 = shapeFactory1.getShape("RECTANGLE");
    shape3.draw();
    Shape shape4 = shapeFactory1.getShape("SQUARE");
    shape4.draw();
  }
}

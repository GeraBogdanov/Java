package patterns.abstract_pattern.figure;

import patterns.abstract_pattern.Shape;

public class Square implements Shape {
  @Override

  public void draw() {
    System.out.println("Inside square::draw() method.");
  }
}

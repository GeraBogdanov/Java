package patterns.abstract_pattern.figure;

import patterns.abstract_pattern.Shape;

public class RoundedSquare implements Shape {
  @Override
  public void draw(){
    System.out.println("Inside RoundedSquare::draw() method.");
  }
}

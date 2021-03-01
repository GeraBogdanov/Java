package patterns.abstract_pattern.figure;

import patterns.abstract_pattern.Shape;

import java.util.Arrays;
import java.util.List;

public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Inside rectangle::draw() method.");
  }
  public void foo(){
    String[] string = {"foo","bar"};
    List<String> l =Arrays.asList(string);

  }
}

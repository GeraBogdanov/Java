package patterns.builder;

import patterns.builder.builders.CarBuilder;
import patterns.builder.builders.CarManualBuilder;
import patterns.builder.cars.Car;
import patterns.builder.cars.Manual;
import patterns.builder.director.Director;

public class Demo {
  public static void main(String[] args) {
    Director director = new Director();

    CarBuilder builder = new CarBuilder();
    director.constructSUV(builder);

    Car car = builder.getResult();
    System.out.println("Car built:\n" + car.getCarType());


    CarManualBuilder manualBuilder = new CarManualBuilder();

    // Директор может знать больше одного рецепта строительства.
    director.constructSUV(manualBuilder);
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());
  }
}

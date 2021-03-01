package patterns.builder.builders;

import patterns.builder.cars.Car;
import patterns.builder.cars.CarType;
import patterns.builder.components.Engine;
import patterns.builder.components.GPSNavigator;
import patterns.builder.components.Transmission;
import patterns.builder.components.TripComputer;

public class CarBuilder implements Builder {
  private CarType type;
  private int seats;
  private Engine engine;
  private Transmission transmission;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;

  public void setCarType(CarType type) {
    this.type = type;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  public void setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }

  public Car getResult() {
    return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
  }
}

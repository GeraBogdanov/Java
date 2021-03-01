package patterns.builder.components;

public class GPSNavigator {
  private String route;

  public GPSNavigator() {
    this.route = "221b, Baker Street, London";
  }

  public GPSNavigator(String manualRoute) {
    this.route = manualRoute;
  }

  public String getRoute() {
    return route;
  }
}

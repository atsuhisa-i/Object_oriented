public class Plane extends Vehicle
{
  private int sheet;

  public Plane(int m)
  {
    meter = m;
    price = 200;
    sheet = 1000;
  }
  public void calcFare()
  {
    fare = meter * price + sheet;
    System.out.println("航空機の運賃は" + fare + "です。");
  }
}
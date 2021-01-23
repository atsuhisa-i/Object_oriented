public class Sample6
{
  public static void main(String args[])
  {
    Vehicle vl = new Car(50);
    vl.calcFare();
    Vehicle v2 = new Plane(150);
    v2.calcFare();
  }
}
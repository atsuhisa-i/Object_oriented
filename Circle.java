public class Circle
{
  private int x;
  private int y;
  private int r;

  public Circle(int x, int y, int r)
  {
    this.x = x;
    this.y = y;
    this.r = r;
  }
  public void show()
  {
    System.out.println("円を(" + x + "," + y + ")に表示します。");
    System.out.println("半径の大きさは" + r + "です。");
  }
}
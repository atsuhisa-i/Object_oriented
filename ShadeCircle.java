import java.awt.*;

public class ShadeCircle implements Shape
{
  private Circle c;

  public ShadeCircle(Circle c)
  {
    this.c = c;
  }
  public int getX()
  {
    return c.getX();
  }
  public int getY()
  {
    return c.getY();
  }
  public void draw(Graphics g)
  {
    c.draw(g);
    g.setColor(Color.gray);
    g.drawOval(c.getX()+5, c.getY()+5, 10, 10);
  }
}
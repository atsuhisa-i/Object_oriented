import java.io.*;

public class Practice3
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int r = Integer.parseInt(args[2]);

    Circle c = new Circle(x, y,r);
    c.show();
  }
}
import java.io.*;

public class Practice2
{

  public static void main(String args[])throws IOException
  {
    System.out.println("x座標を入力して下さい。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    
    String str1 = br.readLine();
    int x = Integer.parseInt(str1);

    System.out.println("y座標を入力して下さい。");

    String str2 = br.readLine();
    int y = Integer.parseInt(str2);

    System.out.println("半径を入力して下さい。");

    String str3 = br.readLine();
    int r = Integer.parseInt(str3);

    Circle c = new Circle(x, y, r);
    c.show();
  }
}
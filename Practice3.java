import java.io.*;

public class Practice3
{
  public static void main(String args[])
  {
    ShowApplication sap = new ShowApplication(new HTMLApplication());
    sap.open(args[0]);
    sap.show();
    sap.save(args[1]);
  }
}
import java.io.*;

public class Sample3
{
  public static void main(String args[])throws IOException
  {
    Person p[];

    System.out.println("人数を入力して下さい。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    
    String str = br.readLine();
    int num = Integer.parseInt(str);

    p = new Person[num];

    for(int i=0; i<num; i++){

      System.out.println("年齢を入力して下さい。");
      str = br.readLine();
      int age = Integer.parseInt(str);

      System.out.println("体重を入力して下さい。");
      str = br.readLine();
      double weight = Double.parseDouble(str);

      System.out.println("身長を入力して下さい。");
      str = br.readLine();
      double height = Double.parseDouble(str);

      p[i] = new Person(age, weight, height);
    }

    for(int i=0; i<num; i++){
      p[i].show();
    }
  }
}
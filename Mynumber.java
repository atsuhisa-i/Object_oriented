public class MyNumber
{
  private int num;

  public Mynumber(int n)
  {
    if(n>=0 && n<=1000)
    {
      num = n;
    }
    else{
      num = 0;
      System.out.println("設定できませんでした。");
    }
  }
  public void setNum(int n)
  {
    if(n >= 0 && n <= 1000){
      num = n;
    }
    else{
      num = 0;
      System.out.println("設定できませんでした。")
    }
  }
  public int getNum()
  {
    return num;
  }
}
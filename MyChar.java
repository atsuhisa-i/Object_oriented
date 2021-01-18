public class Mychar
{
  private char ch;

  public MyChar(char c)
  {
    if(c >= 'a' && c <= 'z'){
      ch = c;
    }
    else{
      ch = ' ';
      System.out.println("設定できませんでした。");
    }
  }
  public char getChar()
  {
    return ch;
  }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Practice1 extends JFrame
{
  private JTable tb;
  private JScrollPane sp;

  public static void main(String args[])
  {
    Practice1 sm = new Practice1();
  }
  public Practice1()
  {
    super("サンプル");

    tb = new JTable(new CharTableModel());
    sp = new JScrollPane(tb);

    add(sp, BorderLayout.CENTER);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
  }
}
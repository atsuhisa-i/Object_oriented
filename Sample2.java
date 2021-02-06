import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample2 extends JFrame implements ActionListener
{
  private JTextArea ta;
  private JButton bt;
  private JPanel pn;

  public static void main(String args[])
  {
    Sample2 sm = new Sample2();
  }
  public Sample2()
  {
    super("サンプル");
    TextReader tr = new TextReader();

    ta = new JTextArea(tr.getText());
    ta.setLineWrap(true);
    bt = new JButton("再読込");
    pn = new JPanel();

    pn.add(bt);
    add(ta, BorderLayout.CENTER);
    add(pn, BorderLayout.SOUTH);
    bt.addActionListener(this);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    TextReader tr = new TextReader();

    ta.setText(tr.getText());
  }
}
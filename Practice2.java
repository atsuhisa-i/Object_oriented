import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice2 extends JFrame implements ActionListener
{
  private BoldBarGraph bbg;
  private LineGraph lg;
  private Vector<Observer> obs;
  private JList<Integer> ls;
  private JScrollPane sp;
  private JButton bt;

  public static void main(String args[])
  {
    Practice2 pr = new Practice2();
  }
  public Practice2()
  {
    super("サンプル");
    obs = new Vector<Observer>();
    bbg = new BoldBarGraph();
    lg = new LineGraph();
    addObserver(bbg);
    addObserver(lg);

    ls = new JList<Integer>();
    sp = new JScrollPane(ls);
    bt = new JButton("読込");

    add(sp, BorderLayout.CENTER);
    add(bt, BorderLayout.SOUTH);

    bt.addActionListener(this);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
    bbg.setVisible(true);
    lg.setVisible(true);
  }
  void addObserver(Observer o)
  {
    obs.add(o);
  }
  void notify(Vector<Integer> d)
  {
    Iterator<Observer> it = obs.iterator();
    while(it.hasNext()){
      Observer o = it.next();
      o.update(d);
    }
  }
  public void actionPerformed(ActionEvent e)
  {
    JFileChooser fc = new JFileChooser();
    try{
      int res = fc.showOpenDialog(this);
      if(res == JFileChooser.APPROVE_OPTION){
        File fl = fc.getSelectedFile();
        BufferedReader br = 
          new BufferedReader(new FileReader(fl));
        
        Vector<Integer> data = new Vector<Integer>();
        String str;
        while((str = br.readLine()) != null){
          data.add(Integer.parseInt(str));
        }
        br.close();
        ls.setListData(data);
        notify(data);
      }
    }catch(Exception ex){}
  }
}
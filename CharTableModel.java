import javax.swing.table.*;

public class CharTableModel extends AbstractTableModel
{
  public int getRowCount()
  {
    return 16;
  }
  public int getColumnCount()
  {
    return 8;
  }
  public Object getValueAt(int row, int column)
  {
    Character ch = new Character((char)(column*16 + row));
    return ch;
  }
  public String getClolumnName(int column)
  {
    return Integer.toHexString(column);
  }
}
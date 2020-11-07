import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.text.*;
import java.io.*;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.border.EmptyBorder;

public class test extends JFrame
{
    public test()
    {
        Connection con = null;
        try {
            java.lang.Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bigbraintms?serverTimezone=UTC","bigbrain","password");
            System.out.println("success");
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args)
    {new test();}
}

/*public class MultiLineCellRenderer extends JTextArea implements TableCellRenderer
{
    public MultiLineCellRenderer()
    {
        setLineWrap(true);
        setWrapStyleWord(true);
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column)
    {
        setFont(table.getFont());
        setText((value == null) ? "" : value.toString());
        return this;
    }
}*/
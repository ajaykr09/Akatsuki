package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class admin{
	JFrame admin;
	JPanel po,p0,p1,p2,p3;
	JMenuBar M;
	JMenu M1;
	JMenuItem mi1;
    JLabel m1,m2,m3,m4,m5;
    JButton br1,br2,br3,b1,b2,b3;
	JLabel l0,l1,l2,l3,l4,l5,lo1;
	JTextField t1,t2,t3,t4,t5;
	JTable t;
	Font f1 = new Font("Cambria", Font.BOLD, 15);
    Font f2 = new Font("Cambria", Font.PLAIN, 15);
    Font f3 = new Font("Cambria", Font.BOLD, 20);
	admin() throws SQLException{
		connect s=new connect();
		admin =new JFrame("Admin");
		mi1 = new JMenuItem("Home");
		M = new JMenuBar();
		M1 = new JMenu("Home");
		M1.add(mi1);M.add(M1);

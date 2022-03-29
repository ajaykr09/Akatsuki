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

public class client{
	JFrame client;
	JPanel po,p0,p1,p2,p3,p4;
	JMenuBar M;
	JMenu M1,M2,M3;
    	JMenuItem m1,m2,m3,m4,m5,m6;
	JButton br1,br2,br3,br4,b1,b2,b3,b4,b5;
	JLabel l0,l1,l2,l3,l4,l5;
	JTable t;
	JTextField t1,t2,t3,t4,t5;
	Font f1 = new Font("SansSerif", Font.BOLD, 15);
    	Font f2 = new Font("SansSerif", Font.PLAIN, 15);
    	Font f3 = new Font("SansSerif", Font.BOLD, 20);
	client() throws SQLException{
		connect s=new connect();
		client =new JFrame("Client");
		M = new JMenuBar();
		M1 = new JMenu("Goto");
		M2 = new JMenu("Mac");
		M3 = new JMenu("Others");
		m1 = new JMenuItem("View user_details");m1.setFont(f1);m1.setForeground(Color.black);
		m2 = new JMenuItem("View payment details");m2.setFont(f1);m2.setForeground(Color.black);
		m3 = new JMenuItem("View bills");m3.setFont(f1);m3.setForeground(Color.black);
		m4 = new JMenuItem("Request_for_info");m4.setFont(f1);m4.setForeground(Color.black);
		m5 = new JMenuItem("Logout");
		m6 = new JMenuItem("Home");

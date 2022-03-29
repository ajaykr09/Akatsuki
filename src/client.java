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
		M2.add(m1);M2.add(m2);M2.add(m3);M2.add(m4);M3.add(m5);M1.add(m6);
        	M.add(M1);M.add(M2);M.add(Box.createHorizontalGlue());M.add(M3);
		p0 = new JPanel(new BorderLayout());p0.setBounds(0,0,400,400);p0.setBackground(Color.black);
		l0 = new JLabel("Welcome to");l0.setFont(f3);l0.setBounds(135, 100, 200, 40);
		l1 = new JLabel("E-Governance System");l1.setFont(f3);l1.setBounds(50, 135, 300, 40);
		p0.add(l0);p0.add(l1);
		p1 = new JPanel();p1.setBounds(0,0,400,400);p1.setBackground(Color.black);
		l2 = new JLabel("username: ");l2.setFont(f1);l2.setBounds(50, 20, 150, 40);l2.setForeground(Color.green);
		t1 = new JTextField();t1.setFont(f2);t1.setBounds(200,20,150,40);
		br1 = new JButton("Reset");br1.setFont(f1);br1.setBounds(50,70,100,40);br1.setBackground(Color.orange);
		b1 = new JButton("Search");b1.setFont(f1);b1.setBounds(200,70,100,40);b1.setBackground(Color.orange);
		p1.add(l2);p1.add(t1);p1.add(br1);p1.add(b1);
		p2 = new JPanel();p2.setBounds(0,0,400,400);p2.setBackground(Color.black);
		l3 = new JLabel("payment_id: ");l3.setFont(f1);l3.setBounds(50, 20, 150, 40);l3.setForeground(Color.green);
		t2 = new JTextField();t2.setFont(f2);t2.setBounds(200,20,150,40);
		br2 = new JButton("Reset");br2.setFont(f1);br2.setBounds(50,70,100,40);br2.setBackground(Color.orange);
		b2 = new JButton("Search");b2.setFont(f1);b2.setBounds(200,70,100,40);b2.setBackground(Color.orange);
		p2.add(l3);p2.add(t2);p2.add(br2);p2.add(b2);
		p3 = new JPanel();p3.setBounds(0,0,400,400);p3.setBackground(Color.black);
		l4 = new JLabel("bills_id: ");l4.setFont(f1);l4.setBounds(50, 20, 150, 40);l4.setForeground(Color.green);
		t3 = new JTextField();t3.setFont(f2);t3.setBounds(200,20,150,40);
		br3 = new JButton("Reset");br3.setFont(f1);br3.setBounds(50,70,100,40);br3.setBackground(Color.orange);
		b3 = new JButton("Search");b3.setFont(f1);b3.setBounds(200,70,100,40);b3.setBackground(Color.orange);
		p3.add(l4);p3.add(t3);p3.add(br3);p3.add(b3);
		p4 = new JPanel();p4.setBounds(0,0,400,400);p4.setBackground(Color.black);
		l5 = new JLabel("Service_id: ");l5.setFont(f1);l5.setBounds(50, 20, 150, 40);l5.setForeground(Color.green);
		t4 = new JTextField();t4.setFont(f2);t4.setBounds(200,20,150,40);
		br4 = new JButton("Reset");br4.setFont(f1);br4.setBounds(50,70,100,40);br4.setBackground(Color.orange);
		b4 = new JButton("Search");b4.setFont(f1);b4.setBounds(200,70,100,40);b4.setBackground(Color.orange);
		p4.add(l5);p4.add(t4);p4.add(br4);p4.add(b4);
		client.setJMenuBar(M);
		client.add(p0);client.add(p1);client.add(p2);client.add(p3);client.add(p4);
		p0.setLayout(null);
		p1.setLayout(null);
		p2.setLayout(null);
		p3.setLayout(null);
		p4.setLayout(null);
		p0.setVisible(true);
		p1.setVisible(false);
		p2.setVisible(false);
		p3.setVisible(false);
		p4.setVisible(false);
		client.setVisible(true);
		client.setSize(400,400);client.setBounds(550, 230, 400, 400);
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client.setResizable(false);
		ActionListener x=new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {
	        	if(e.getSource()==m1) {
	        		p0.setVisible(false);
	        		p1.setVisible(true);
	                p2.setVisible(false);
	                p3.setVisible(false);
	                p4.setVisible(false);
	        	}
	        	if(e.getSource()==m2) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
	                p2.setVisible(true);
	                p3.setVisible(false);
	                p4.setVisible(false);
	        	}
	        	if(e.getSource()==m3) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
	                p2.setVisible(false);
	                p3.setVisible(true);
	                p4.setVisible(false);
	        	}
	        	if(e.getSource()==m4) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
	                p2.setVisible(false);
	                p3.setVisible(false);
	                p4.setVisible(true);
	        	}	        	

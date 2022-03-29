package temp;

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
		m1 = new JLabel("View user_details");m1.setFont(f1);m1.setForeground(Color.black);m1.setBounds(10,50,150,40);
        m2 = new JLabel("View bills");m2.setFont(f1);m2.setForeground(Color.black);m2.setBounds(10,100,150,40);
        m3 = new JLabel("View payments");m3.setFont(f1);m3.setForeground(Color.black);m3.setBounds(10,150,150,40);
        m4 = new JLabel("Logout");m4.setBounds(10,200,150,40);m4.setFont(f1);
        m5 = new JLabel("Home");m5.setBounds(10,10,150,40);m5.setFont(f1);
		po = new JPanel(new BorderLayout());po.setBounds(0,0,150,400);po.setBackground(Color.cyan);
		po.add(m5);po.add(m1);po.add(m2);po.add(m3);po.add(m4);
		p0 = new JPanel(new BorderLayout());p0.setBounds(220,0,430,400);p0.setBackground(Color.black);
		l0 = new JLabel("Welcome to");l0.setFont(f3);l0.setBounds(135, 100, 200, 40);l0.setForeground(Color.green);
		l1 = new JLabel("E-Governance System");l1.setFont(f3);l1.setBounds(50, 135, 300, 40);l1.setForeground(Color.green);
		p0.add(l0);p0.add(l1);
		p1 = new JPanel();p1.setBounds(0,0,400,400);p1.setBackground(Color.black);
		l2 = new JLabel("Username: ");l2.setFont(f1);l2.setBounds(50, 20, 150, 40);l2.setForeground(Color.green);
		t1 = new JTextField();t1.setFont(f2);t1.setBounds(200,20,150,40);
		br1 = new JButton("Reset");br1.setFont(f1);br1.setBounds(50,70,100,40);br1.setBackground(Color.orange);
		b1 = new JButton("Search");b1.setFont(f1);b1.setBounds(200,70,100,40);b1.setBackground(Color.orange);
		p1.add(l2);p1.add(t1);p1.add(br1);p1.add(b1);
		p2 = new JPanel();p2.setBounds(0,0,400,400);p2.setBackground(Color.black);
		l3 = new JLabel("Bills id: ");l3.setFont(f1);l3.setBounds(50, 20, 150, 40);l3.setForeground(Color.green);
		t2 = new JTextField();t2.setFont(f2);t2.setBounds(200,20,150,40);
		br2 = new JButton("Reset");br2.setFont(f1);br2.setBounds(50,70,100,40);br2.setBackground(Color.orange);
		b2 = new JButton("Search");b2.setFont(f1);b2.setBounds(200,70,100,40);b2.setBackground(Color.orange);
		p2.add(l3);p2.add(t2);p2.add(br2);p2.add(b2);
		p3 = new JPanel();p3.setBounds(0,0,400,400);p3.setBackground(Color.black);
		l4 = new JLabel("Payment id: ");l4.setFont(f1);l4.setBounds(50, 20, 150, 40);l4.setForeground(Color.green);
		t3 = new JTextField();t3.setFont(f2);t3.setBounds(200,20,150,40);
		br3 = new JButton("Reset");br3.setFont(f1);br3.setBounds(50,70,100,40);br3.setBackground(Color.orange);
		b3 = new JButton("Search");b3.setFont(f1);b3.setBounds(200,70,100,40);b3.setBackground(Color.orange);
		p3.add(l4);p3.add(t3);p3.add(br3);p3.add(b3);
		admin.setJMenuBar(M);
		admin.add(p0);admin.add(p1);admin.add(p2);admin.add(p3);admin.add(po);
		po.setLayout(null);
		p0.setLayout(null);
		p1.setLayout(null);
		p2.setLayout(null);
		p3.setLayout(null);
		po.setVisible(true);
		p0.setVisible(true);
		p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        admin.setVisible(true);
        admin.setSize(600,400);
        admin.setBounds(550, 230, 600, 400);
        admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        admin.setResizable(false);
		ActionListener x=new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {
	        	if(e.getActionCommand()=="Reset") {
        			t1.setText("");
        			t2.setText("");
        			t3.setText("");
	        	}
	        	if(e.getSource()==mi1) {
	        		admin.setBounds(550, 230, 600, 400);
	        		po.setVisible(true);
	        		p0.setVisible(true);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
	        	}
	        	if(e.getSource()==b1) {
	        		try{
	        			String id=t1.getText();
	        			s.preparedStatement = s.connect.prepareStatement("select username,password,ph_number,address,email from user_details where username=?;");
	        	        s.preparedStatement.setString(1,id);
	        	        s.resultSet=s.preparedStatement.executeQuery();
	            		String column[]={"Username" , "Password" , "ph_number","address" ,"email"}; 
	        	    	String[][] rows=new String[1][5];
	        	    	s.resultSet.next();
        	            rows[0][0] = s.resultSet.getString("username");
        	            rows[0][1] = s.resultSet.getString("password");
        	            rows[0][2] = s.resultSet.getString("ph_number");
        	            rows[0][3] = s.resultSet.getString("address");
        	            rows[0][4] = s.resultSet.getString("email");	            
	        	    	t=new JTable(rows,column);t.setBackground(Color.yellow);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,240,400,40);sp.setBackground(Color.black);
	        			t.setFocusable(false);
	        			p1.add(sp);
	            	}catch(Exception e1) {
	            		System.out.println(e1);
	            		JOptionPane.showMessageDialog(admin,"No user with that ID","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        	if(e.getSource()==b2) {
	        		try{
	        			String id=t2.getText();
	        			s.preparedStatement = s.connect.prepareStatement("select username,bills.bill_id,bill_type,bill_desc,ph_number from bills natural join user_details where bill_id=?;");
	        			 int i = Integer.parseInt(id);
	        			s.preparedStatement.setInt(1,i);
	        	        s.resultSet=s.preparedStatement.executeQuery();
	            		String column[]={"username" , "bills_id" , "bill_type","bill_desc" ,"ph_number"}; 
	        	    	String[][] rows=new String[1][5];
	        	    	s.resultSet.next();
        	            rows[0][0] = s.resultSet.getString("username");
        	            rows[0][1] = s.resultSet.getString("bill_id");
        	            rows[0][2] = s.resultSet.getString("bill_type");
        	            rows[0][3] = s.resultSet.getString("bill_desc");
        	            rows[0][4] = s.resultSet.getString("ph_number");        	    
	        	    	t=new JTable(rows,column);t.setBackground(Color.yellow);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,240,400,40);sp.setBackground(Color.black);
	        			t.setFocusable(false);
	        			p2.add(sp);
	            	}catch(Exception e1) {
	            		System.out.println(e1);
	            		JOptionPane.showMessageDialog(admin,"No bill with that ID","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        	if(e.getSource()==b3) {
	        		try{
	        			String id=t3.getText();
	        			s.preparedStatement = s.connect.prepareStatement("select username,payment_id,amount,due_date,ph_number from payments natural join user_details where payment_id=?;");
	        			int i = Integer.parseInt(id);
	        	        s.preparedStatement.setInt(1,i);
	        	        s.resultSet=s.preparedStatement.executeQuery();
	            		String column[]={"Username" ,"Payment_id", "Amount" , "Due_date", "ph_number"}; 
	        	    	String[][] rows=new String[1][5];
	        	    	s.resultSet.next();
        	            rows[0][0] = s.resultSet.getString("username");
        	            rows[0][1] = s.resultSet.getString("payment_id");
        	            rows[0][2] = s.resultSet.getString("amount");
        	            rows[0][3] = String.valueOf(s.resultSet.getDate("due_date"));
        	            rows[0][4] = s.resultSet.getString("ph_number");
	        	    	t=new JTable(rows,column);t.setBackground(Color.yellow);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,240,400,40);sp.setBackground(Color.black);
	        			t.setFocusable(false);
	        			p3.add(sp);
	            	}catch(Exception e1) {
	            		System.out.println(e1);
	            		JOptionPane.showMessageDialog(admin,"No payments with that ID","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        }
		};
		  m5.addMouseListener(new MouseAdapter() {
			  
              @Override
              public void mouseClicked(MouseEvent e) {
            	  admin.setBounds(550, 230, 600, 400);
            	  po.setVisible(true);
	        		p0.setVisible(true);
	        		p1.setVisible(false);
	        		p2.setVisible(false);
	        		p3.setVisible(false); 
	        		
              }
          });
		  m4.addMouseListener(new MouseAdapter() {
			  
              @Override
              public void mouseClicked(MouseEvent e) {
            	  admin.setBounds(550, 230, 400, 400);
            	  try {
	                    if (s.resultSet != null) s.resultSet.close();
	                    if (s.statement != null) s.statement.close();
	                    if (s.connect != null) s.connect.close();
	                } 
	                catch (Exception e1) {}
	        		finally{
	        			if(JOptionPane.showConfirmDialog(admin,"Sure want to logout?", "Exit?",JOptionPane.YES_NO_OPTION,
		                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
							try {login l = new login();l.log.setVisible(true);}
							catch (SQLException e1) {e1.printStackTrace();}
		        			finally{admin.setVisible(false);}
		        		}
	        		}
              }
          });
		  m3.addMouseListener(new MouseAdapter() {
			  
              @Override
              public void mouseClicked(MouseEvent e) {
            	  admin.setBounds(550, 230, 400, 400);
            	  	po.setVisible(false);
	        		p0.setVisible(false);
	        		p1.setVisible(false);
	                p2.setVisible(false);
	                p3.setVisible(true);
              }
          });
		  m2.addMouseListener(new MouseAdapter() {
			  
              @Override
              public void mouseClicked(MouseEvent e) {
            	  admin.setBounds(550, 230, 400, 400);
            	  po.setVisible(false);
	        		p0.setVisible(false);
	        		p1.setVisible(false);
	                p2.setVisible(true);
	                p3.setVisible(false);
              }
          });
		  m1.addMouseListener(new MouseAdapter() {
			 
              @Override
              public void mouseClicked(MouseEvent e) {
            	  admin.setBounds(550, 230, 400, 400);
            	  po.setVisible(false);
	        		p0.setVisible(false);
	        		p1.setVisible(true);
	                p2.setVisible(false);
	                p3.setVisible(false);
              }
          });
		  mi1.addActionListener(x);
	    br1.addActionListener(x);
	    b1.addActionListener(x);
	    br2.addActionListener(x);
	    b2.addActionListener(x);
	    br3.addActionListener(x);
	    b3.addActionListener(x);	    
	}
}

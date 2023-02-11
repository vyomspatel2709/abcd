import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class SwingDemo implements ActionListener {
     JFrame f;
     JLabel l1,l2,l3,l4,l5; 	
	 JTextField t1,t2,t3,t4,t5;
     JButton b1,b2,b3,b4,b5;
	
     public SwingDemo()
     {
    	 f=new JFrame("My Swing Example");
    	 f.setVisible(true);
    	 f.setSize(310, 340);
    	 f.setLayout(new FlowLayout());
    	 f.setLayout(new GridLayout(7,2));
    	 f.setLayout(null);
    	 f.setResizable(false);;
    	 
    	 l1=new JLabel("ID");
    	 l2=new JLabel("FIRST NAME");
    	 l3=new JLabel("LAST NAME");
    	 l4=new JLabel("EMAIL");
    	 l5=new JLabel("MOBILE");
    	 
    	 t1=new JTextField(20);
    	 t2=new JTextField(20);
    	 t3=new JTextField(20);
    	 t4=new JTextField(20);
    	 t5=new JTextField(20);
    	 
    	 b1=new JButton("INSERT");
    	 b2=new JButton("SEARCH");
    	 b3=new JButton("UPDATE");
    	 b4=new JButton("DELETE");
    	 b5=new JButton("CLEAR");
    	 
    	 
    	 f.add(l1);
    	 f.add(t1);
    	 f.add(l2);
    	 f.add(t2);
    	 f.add(l3);
    	 f.add(t3);
    	 f.add(l4);
    	 f.add(t4);
    	 f.add(l5);
    	 f.add(t5);
    	 f.add(b1);
    	 f.add(b2);
    	 f.add(b3);
    	 f.add(b4);
    	 f.add(b5);
    	 
    	 l1.setBounds(20, 20, 100, 20);
    	 l2.setBounds(20, 60, 100, 20);
    	 l3.setBounds(20, 100, 100, 20);
    	 l4.setBounds(20, 140, 100, 20);
    	 l5.setBounds(20, 180, 100, 20);
    	 
    	 t1.setBounds(120, 20, 150, 20);
    	 t2.setBounds(120, 60, 150, 20);
    	 t3.setBounds(120, 100, 150, 20);
    	 t4.setBounds(120, 140, 150, 20);
    	 t5.setBounds(120, 180, 150, 20);
    	 
    	 
    	 b1.setBounds(20, 220, 100, 20);
    	 b2.setBounds(200, 220, 100, 20);
    	 b3.setBounds(20, 260, 100, 20);
    	 b4.setBounds(200, 260, 100, 20);
    	 b5.setBounds(120, 220, 80, 60);
    	 
    	 b1.addActionListener(this);
    	 b2.addActionListener(this);
    	 b3.addActionListener(this);
    	 b4.addActionListener(this);
    	 b5.addActionListener(this);
    }
    public static void main(String[] args) {
		new SwingDemo();
	}
     
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			String sql="insert into data(fname,lname,email,mobile) values(?,?,?,?)";
		    PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, t2.getText());
			pst.setString(2, t3.getText());
			pst.setString(3, t4.getText());
			pst.setString(4, t5.getText());
			pst.executeUpdate();
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b2)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
				String sql="select * from data where id=?";
			    PreparedStatement pst=conn.prepareStatement(sql);
			    pst.setInt(1, Integer.parseInt(t1.getText()));
			    ResultSet rs=pst.executeQuery();
			    if(rs.next())
			    {	
			    	t2.setText(rs.getString("fname"));
			    	t3.setText(rs.getString("lname"));
			    	t4.setText(rs.getString("email"));
			    	t5.setText(rs.getString("mobile"));
			    }
			    else
			    {
			    	t2.setText("");
			    	t3.setText("");
			    	t4.setText("");
			    	t5.setText("");		    	
			    }
		
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b3)
		{
		  try {
			    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
				String sql="update data set fname=?,lname=?,email=?,mobile=? where id=?";
			    PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
			    pst.setString(1, t2.getText());
				pst.setString(2, t3.getText());
				pst.setString(3, t4.getText());
				pst.setString(4, t5.getText());
				pst.setInt(5, Integer.parseInt(t1.getText()));
				pst.executeUpdate();
				t1.setText("");
				t2.setText("");
		    	t3.setText("");
		    	t4.setText("");
		    	t5.setText("");		    	
		    	    
			    
		} catch (Exception e) {
		    e.printStackTrace();
		}	
		}
		else if(ae.getSource()==b4)
		{
			try {
				 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
					String sql="delete from data where id=?";
				    PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
				    pst.setInt(1, Integer.parseInt(t1.getText()));
					pst.executeUpdate();
					
				    t1.setText("");
					t2.setText("");
			    	t3.setText("");
			    	t4.setText("");
			    	t5.setText("");		    	
			    	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b5)
		{
		
			t1.setText("");
			t2.setText("");
	    	t3.setText("");
	    	t4.setText("");
	    	t5.setText("");		    	
	    	
		}
		
		
	}
     
	

}

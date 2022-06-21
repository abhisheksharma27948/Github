import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Color;

public class Bill extends JFrame
{
	JButton Light_bill,Gas_bill,House_rent,Back;
	JButton total_Bill;
	JTextField t1,t2,t3,t4;
	JLabel image_;
	ImageIcon img;

	MyActionListener ml = new MyActionListener(this);
	Bill()
	{

		setLayout(null);
		setBounds(0,0,1260,1000);
		setBackground(Color.CYAN);
		
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();

		img = new ImageIcon("a.JPG");
		image_ = new JLabel(img);
		image_.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		image_.setVisible(true);

		Light_bill =new JButton("Light_bill");
		Gas_bill =new JButton("Gas_bill");
		House_rent =new JButton("House_rent");
		total_Bill =new JButton("Total_Bill");
		Back =new JButton("Home");
		
		Font f1 = new Font("Arial",Font.BOLD,20);


		Light_bill.setFont(f1);
		Gas_bill.setFont(f1);
		House_rent.setFont(f1);
		total_Bill.setFont(f1);
		Back.setFont(f1);

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(Light_bill);
		add(Gas_bill);
		add(House_rent);
		add(total_Bill);
		add(Back);
		add(image_);
		
		t1.setBounds(300,100,150,50);
		t2.setBounds(300,200,150,50);
		t3.setBounds(300,300,150,50);
		t4.setBounds(650,400,150,50);
		Light_bill.setBounds(100,100,150,50);
		Gas_bill.setBounds(100,200,150,50);
		House_rent.setBounds(100,300,150,50);
		total_Bill.setBounds(400,400,200,50);	
		Back.setBounds(600,200,200,50);	

		/*Light_bill.addActionListener(ml);
		Gas_bill.addActionListener(ml);
		House_rent.addActionListener(ml);*/
		total_Bill.addActionListener(ml);
		Back.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					//System.exit(0);
					setVisible(false);
				}
			});
	}

	public static void main(String args[]) throws IOException
	{
			Bill mf1 = new Bill();
			mf1.setVisible(true);
	}
}


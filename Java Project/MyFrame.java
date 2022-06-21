//package familyExpense;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Color;
import javax.swing.JFrame;


public class MyFrame extends JFrame
{
	//TextField t1,t2,t3;
	
JButton Bill,Grocery,Fees,Functions;

JLabel image;

ImageIcon img;

	MyActionListener ml = new MyActionListener(this);
	MyFrame()
	{
		//super("Family Expence Tracker");
		setLayout(null);
		setBounds(0,0,1460,1000);
		setBackground(Color.DARK_GRAY);
		
		//t1=new TextField();

		img = new ImageIcon("ab.JPG");
		image = new JLabel(img);
		image.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		image.setVisible(true);
		
		Font f1 = new Font("Arial",Font.BOLD,30);	

		//add(t1);
		
		//t1.setBounds(100,160,150,50);
		

		Bill = new JButton("Bill");
		Grocery = new JButton("Grocery");
		Fees = new JButton("Fees");
		Functions = new JButton("Functions");
	
		add(Bill);
		add(Grocery);
		add(Fees);
		add(Functions);
		add(image);



		Bill.setBounds(100,100,200,65);
		Grocery.setBounds(350,100,200,65);
		Fees.setBounds(600,100,200,65);
		Functions.setBounds(850,100,200,65);
	
		Bill.setFont(f1);
		Grocery.setFont(f1);
		Fees.setFont(f1);
		Functions.setFont(f1);

		Bill.addActionListener(ml);
		Grocery.addActionListener(ml);
		Fees.addActionListener(ml);
		Functions.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	/*public void paint(Graphics g)
	{
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("Pictures\\child-2364849__340.webp");
		g.drawImage(i,0,0,this);
	}*/
	public static void main(String args[])
	{
			MyFrame mf = new MyFrame();
			//JFrame f = new JFrame();
			//f.add(mf);
			mf.setVisible(true);
	}
}

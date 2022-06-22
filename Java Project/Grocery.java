import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Color;

public class Grocery extends JFrame
{
	JButton Rice,Wheat,Beans;
	JButton total_Grocery,_Back;
	JTextField t1,t2,t3,t4;
	JLabel IMAGe;
	ImageIcon img;

	MyActionListener ml = new MyActionListener(this);
	Grocery()
	{
		setLayout(null);
		setBounds(0,0,1260,1000);
		setBackground(Color.RED);
		
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();

		img = new ImageIcon("Grocery_.JPG");
		IMAGe = new JLabel(img);
		IMAGe.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		IMAGe.setVisible(true);

		Rice =new JButton("Rice");
		Wheat =new JButton("Wheat");
		Beans =new JButton("Beans");
		total_Grocery =new JButton("Total_Grocery");
		_Back =new JButton("Home_");
		
		Font f1 = new Font("Arial",Font.BOLD,20);	
	
		Rice.setFont(f1);
		Wheat.setFont(f1);
		Beans.setFont(f1);
		total_Grocery.setFont(f1);
		_Back.setFont(f1);

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(Rice);
		add(Wheat);
		add(Beans);
		add(total_Grocery);
		add(_Back);
		add(IMAGe);
		
		t1.setBounds(300,100,150,50);
		t2.setBounds(300,200,150,50);
		t3.setBounds(300,300,150,50);
		t4.setBounds(650,400,200,50);
		Rice.setBounds(100,100,150,50);
		Wheat.setBounds(100,200,150,50);
		Beans.setBounds(100,300,150,50);
		total_Grocery.setBounds(400,400,200,50);
		_Back.setBounds(600,200,200,50);

		/*Rice.addActionListener(ml);
		Wheat.addActionListener(ml);
		Beans.addActionListener(ml);*/
		total_Grocery.addActionListener(ml);
		_Back.addActionListener(ml);
		
		
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					//System.exit(0);
					setVisible(false);
				}
			});
	}
	public static void main(String args[])
	{
			Grocery mf2 = new Grocery();
			mf2.setVisible(true);
	}
}


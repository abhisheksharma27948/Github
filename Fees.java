import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Color;

public class Fees extends JFrame
{
	JButton School_Fees,Bus_Fees,Tuition_Fees,Back_;
	JButton total_Fees;
	JTextField t1,t2,t3,t4;
	JLabel IMAGe;
	ImageIcon img;
	
	MyActionListener ml = new MyActionListener(this);
	Fees()
	{
		setLayout(null);
		setBounds(0,0,1260,1000);
		setBackground(Color.GREEN);
		
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();

		img = new ImageIcon("abc.JPG");
		IMAGe = new JLabel(img);
		IMAGe.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		IMAGe.setVisible(true);

		School_Fees =new JButton("School_Fees");
		Bus_Fees =new JButton("Bus_Fees");
		Tuition_Fees =new JButton("Tuition_Fees");
		total_Fees =new JButton("Total_Fees");
		Back_ =new JButton("HOME");
		
		Font f1 = new Font("Arial",Font.BOLD,20);	
	
		School_Fees.setFont(f1);
		Bus_Fees.setFont(f1);
		Tuition_Fees.setFont(f1);
		total_Fees.setFont(f1);
		Back_.setFont(f1);

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(School_Fees);
		add(Bus_Fees);
		add(Tuition_Fees);
		add(total_Fees);
		add(Back_);
		add(IMAGe);
		
		t1.setBounds(350,100,150,50);
		t2.setBounds(350,200,150,50);
		t3.setBounds(350,300,150,50);
		t4.setBounds(650,400,150,50);
		School_Fees.setBounds(100,100,200,50);
		Bus_Fees.setBounds(100,200,150,50);
		Tuition_Fees.setBounds(100,300,200,50);
		total_Fees.setBounds(400,400,200,50);
		Back_.setBounds(600,200,200,50);

		/*School_Fees.addActionListener(ml);
		Bus_Fees.addActionListener(ml);
		Tuition_Fees.addActionListener(ml);*/
		total_Fees.addActionListener(ml);
		Back_.addActionListener(ml);
		
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
			Fees mf3 = new Fees();
			mf3.setVisible(true);
	}
}


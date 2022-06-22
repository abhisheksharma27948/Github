import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Color;

public class Functions extends JFrame
{
	JButton Birthday,Marriage,Festival,Family_Tour,BACK;
	JButton total_Functions;
	JTextField t1,t2,t3,t4,t5;
	JLabel IMAGe;
	ImageIcon img;

	MyActionListener ml = new MyActionListener(this);
	Functions()
	{
		setLayout(null);
		setBounds(0,0,1260,1000);
		setBackground(Color.BLUE);
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();

		img = new ImageIcon("c.JPG");
		IMAGe = new JLabel(img);
		IMAGe.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		IMAGe.setVisible(true);

		Birthday =new JButton("Birthday");
		Marriage =new JButton("Marriage");
		Festival =new JButton("Festival");
		Family_Tour =new JButton("Family_Tour");
		total_Functions =new JButton("Total_");
		BACK =new JButton("_HOME");
		
		Font f1 = new Font("Arial",Font.BOLD,20);	
	
		Birthday.setFont(f1);
		Marriage.setFont(f1);
		Festival.setFont(f1);
		Family_Tour.setFont(f1);
		total_Functions.setFont(f1);
		BACK.setFont(f1);

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(Birthday);
		add(Marriage);
		add(Festival);
		add(Family_Tour);
		add(total_Functions);
		add(BACK);
		add(IMAGe);
		
		t1.setBounds(300,100,150,50);
		t2.setBounds(300,200,150,50);
		t3.setBounds(300,300,150,50);
		t4.setBounds(300,400,150,50);
		t5.setBounds(650,500,150,50);
		Birthday.setBounds(100,100,150,50);
		Marriage.setBounds(100,200,150,50);
		Festival.setBounds(100,300,150,50);
		Family_Tour.setBounds(100,400,180,50);
		total_Functions.setBounds(400,500,200,50);
		BACK.setBounds(600,200,200,50);

		/*Birthday.addActionListener(ml);
		Marriage.addActionListener(ml);
		Festival.addActionListener(ml);
		Family_Tour.addActionListener(ml);*/
		total_Functions.addActionListener(ml);
		BACK.addActionListener(ml);
	
		
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
			Functions mf4 = new Functions();
			mf4.setVisible(true);
	}
}


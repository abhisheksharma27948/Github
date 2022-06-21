//package p1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
//import java.util.*;

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	Bill mf1;
	Grocery mf2;
	Fees mf3;
	Functions mf4;

	MyActionListener(MyFrame m)
	{
		this.mf = m;
	}

	// ActionListener for Bill
	MyActionListener(Bill m)
	{
		this.mf1 = m;
	}

	// ActionListener for Grocery
	MyActionListener(Grocery m)
	{
		this.mf2 = m;
	}

	// ActionListener for Fees
	MyActionListener(Fees m)
	{
		this.mf3 = m;
	}

	// ActionListener for Functions
	MyActionListener(Functions m)
	{
		this.mf4 = m;
	}

	public void actionPerformed(ActionEvent e)
	{

		System.out.println(e);
		
		
		if(e.getActionCommand().equals("Home"))
		{
			mf1.setVisible(false);
			mf.setVisible(true);
		}

		if(e.getActionCommand().equals("Home_"))
		{
			mf2.setVisible(false);
			mf.setVisible(true);
		}

		if(e.getActionCommand().equals("HOME"))
		{
			mf3.setVisible(false);
			mf.setVisible(true);
		}

		if(e.getActionCommand().equals("_HOME"))
		{
			mf4.setVisible(false);
			mf.setVisible(true);
		}


		if(e.getActionCommand().equals("Total_Bill"))
		{ 			
            Integer num1 = Integer.parseInt(this.mf1.t1.getText());
			Integer num2 = Integer.parseInt(this.mf1.t2.getText());
			Integer num3 = Integer.parseInt(this.mf1.t3.getText());
			Integer sum = num1+num2+num3;
			this.mf1.t4.setText(sum.toString());
			System.out.println(sum);
			try{
				FileWriter fw = new FileWriter("bill.txt",true);
				fw.write(sum.toString()+"#");
				fw.close();
			}
			catch(Exception excp)
			{
				System.out.println(excp);
			}

		}
 			
		if(e.getActionCommand().equals("Total_Grocery"))
		//else if(e.getSource().equals(this.mf2.Total_Grocery))
		{ 			
           	Integer num1 = Integer.parseInt(this.mf2.t1.getText());
			Integer num2 = Integer.parseInt(this.mf2.t2.getText());
			Integer num3 = Integer.parseInt(this.mf2.t3.getText());
			Integer sum = num1+num2+num3;
			this.mf2.t4.setText(sum.toString());
			System.out.println(sum);

			try{
				FileWriter fw = new FileWriter("Grocery.txt",true);
				fw.write(sum.toString()+"#");
				fw.close();
			}
			catch(Exception excp)
			{
				System.out.println(excp);
			}
		}

		if(e.getActionCommand().equals("Total_Fees"))
		//if(e.getSource().equals(this.mf3.total))
		{ 
			//e.getSource().equals(this.mf3.total)
            Integer num1 = Integer.parseInt(this.mf3.t1.getText());
			Integer num2 = Integer.parseInt(this.mf3.t2.getText());
			Integer num3 = Integer.parseInt(this.mf3.t3.getText());
			Integer sum = num1+num2+num3;
			this.mf3.t4.setText(sum.toString());
			System.out.println(sum);
			try{
				FileWriter fw = new FileWriter("Fees.txt",true);
				fw.write(sum.toString()+"#");
				fw.close();
			}
			catch(Exception excp)
			{
				System.out.println(excp);
			}
		}
		
		//if(e.getSource().equals(this.mf4.Total_Functions))
		if(e.getActionCommand().equals("Total_"))
		{ 
            Integer num1 = Integer.parseInt(this.mf4.t1.getText());
			Integer num2 = Integer.parseInt(this.mf4.t2.getText());
			Integer num3 = Integer.parseInt(this.mf4.t3.getText());
			Integer num4 = Integer.parseInt(this.mf4.t4.getText());
			Integer sum = num1+num2+num3+num4;
			this.mf4.t5.setText(sum.toString());
			System.out.println(sum);

			try{
				FileWriter fw = new FileWriter("Function.txt",true);
				fw.write(sum.toString()+"#");
				fw.close();
			}
			catch(Exception excp)
			{
				System.out.println(excp);
			}
		}
			
		if(e.getActionCommand().equals("Bill"))
		//if(e.getSource().equals(this.mf.Bill))
		{
			this.mf1 = new Bill();
			this.mf1.setVisible(true);
		}
			
		//if(e.getActionCommand().equals("Grocery"))
		if(e.getSource().equals(this.mf.Grocery))
		{
			mf2 = new Grocery();
			this.mf2.setVisible(true);
		}

		//if(e.getActionCommand().equals("Fees"))
		if(e.getSource().equals(this.mf.Fees))
		{
			mf3 = new Fees();
			this.mf3.setVisible(true);
		}
			
		//if(e.getActionCommand().equals("Functions"))
		if(e.getSource().equals(this.mf.Functions))
		{
			mf4 = new Functions();
			this.mf4.setVisible(true);
		}
	}
}
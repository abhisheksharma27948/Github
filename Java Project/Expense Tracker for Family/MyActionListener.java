//set classpath=pdfbox-app-2.0.26.jar;.;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
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
			try
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

				PDDocument document = new PDDocument();

				PDPage page = new PDPage();
				document.addPage(page);

				PDPageContentStream contentStream = new PDPageContentStream(document, page);
				contentStream.beginText();

				contentStream.setFont(PDType1Font.TIMES_BOLD, 18);

				contentStream.newLineAtOffset(0, 20);
				contentStream.showText("My Bill");
				contentStream.newLineAtOffset(0, 20);
				contentStream.showText(sum.toString()+"Ruppes");

				contentStream.endText();

				System.out.println("Content added");
				contentStream.close();
				document.save("Bill.pdf");
				document.close();
			}
			catch(Exception e1){}

		}

 			
		if(e.getActionCommand().equals("Total_Grocery"))
		//if(e.getSource().equals(this.mf2.Total_Grocery))
		{ 			
           	try
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
				PDDocument document = new PDDocument();

				PDPage page = new PDPage();
				document.addPage(page);

				PDPageContentStream contentStream = new PDPageContentStream(document, page);
				contentStream.beginText();

				contentStream.setFont(PDType1Font.TIMES_BOLD, 18);

				contentStream.newLineAtOffset(0, 20);
				contentStream.showText("My Grocery");
				contentStream.newLineAtOffset(0, 20);
				contentStream.showText(sum.toString());

				contentStream.endText();

				System.out.println("Content added");
				contentStream.close();
				document.save("Grocery.pdf");
				document.close();
			}
			catch(Exception excp){}
		}

		if(e.getActionCommand().equals("Total_Fees"))
		//if(e.getSource().equals(this.mf3.total))
		{ 
			try
			{


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
				PDDocument document = new PDDocument();

				PDPage page = new PDPage();
				document.addPage(page);

				PDPageContentStream contentStream = new PDPageContentStream(document, page);
				contentStream.beginText();

				contentStream.setFont(PDType1Font.TIMES_BOLD, 18);

				contentStream.newLineAtOffset(0, 20);
				contentStream.showText("My Fees");
				contentStream.newLineAtOffset(0, 20);
				contentStream.showText(sum.toString());

				contentStream.endText();

				System.out.println("Content added");
				contentStream.close();
				document.save("Fees.pdf");
				document.close();
			}
			catch(Exception excp){}
		}
		
		//if(e.getSource().equals(this.mf4.Total_Functions))
		if(e.getActionCommand().equals("Total_"))
		{ 
	        try
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
				PDDocument document = new PDDocument();

				PDPage page = new PDPage();
				document.addPage(page);

				PDPageContentStream contentStream = new PDPageContentStream(document, page);
				contentStream.beginText();

				contentStream.setFont(PDType1Font.TIMES_BOLD, 18);

				contentStream.newLineAtOffset(0, 20);
				contentStream.showText("My Function");
				contentStream.newLineAtOffset(0, 20);
				contentStream.showText(sum.toString());

				contentStream.endText();

				System.out.println("Content added");
				contentStream.close();
				document.save("Function.pdf");
				document.close();
			}
			catch(Exception excp){}
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
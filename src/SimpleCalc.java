
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimpleCalc extends JFrame {

public	String s,a, op="";
	String temp="";
	StringBuilder d;
public	double num1 =0,num2=0,res=0.0;
	private JTextField t1;
	private JTextField t2,t3;
	private JButton additionLabel,stractLabel ,multiLabel,divideLabel;
		private JPanel p1;	
		Controller v;
		public SimpleCalc(){
		
			super("SimpleCalculator");
			additionLabel = new JButton("+");
		    stractLabel = new JButton("-");
		    multiLabel = new JButton("*");
		     divideLabel = new JButton("/");
			t1= new JTextField(10);
			t2= new JTextField(10);
			t1.setFont(new Font("Bold",Font.BOLD,22));
			t1.setHorizontalAlignment(JTextField.LEFT);
			t2.setFont(new Font("Bold",Font.BOLD,22));
			t2.setHorizontalAlignment(JTextField.LEFT);
			t3= new JTextField(10);
			t3.setFont(new Font("Bold",Font.BOLD,22));
			t3.setHorizontalAlignment(JTextField.LEFT);
			JPanel p1 =new JPanel();
			JPanel p2 =new JPanel();
			JPanel p3 =new JPanel();
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setVisible(true);
				this.setSize(430,300);
				this.setResizable(true);
		    p1.add(t1);p1.add(t2);
		    p2.add(additionLabel); p2.add(stractLabel); p2.add(multiLabel);p2.add(divideLabel);
			add(p1,BorderLayout.NORTH);
			add(p2,BorderLayout.CENTER); 
			add(t3,BorderLayout.SOUTH);
			//add(t2,BorderLayout.SOUTH);
			
}	
		/*private class CalcHandler implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				 if(e.getActionCommand()=="."){
					if(t1.getText()=="0")
						t1.setText(".");
					
					else{
						s= t1.getText();
						int q=(s.indexOf("."));
								if(q==-1){
						temp= t1.getText()+e.getActionCommand();
					t1.setText(temp);
					}
						else ;
				}}
				else	if(e.getActionCommand()==("+")){
					s= t1.getText();
					num1=Double.parseDouble(s);
					op="+";
					t1.setText("");
				}
				
				else if (e.getActionCommand()=="-"){
					s= t1.getText();
					num1=Double.parseDouble(s);
					op="-";
					t1.setText("");
				}
				else if(e.getActionCommand()=="*"){
					s= t1.getText();
					num1=Double.parseDouble(s);
					op="*";
					t1.setText("");
				}
				
				
				else if(e.getActionCommand()=="/"){
					s= t1.getText();
					num1=Double.parseDouble(s);
					op="/";
					t1.setText("");
					}
				
				else if(e.getActionCommand()=="%"){
					s= t1.getText();
					num1=Double.parseDouble(s);
					op="%";
					t1.setText("");
				 }
				 
				
				else	if(e.getActionCommand()==("=")){
					num2=Double.parseDouble(t1.getText());
				}
				
					
}//event
			}/*/

		public double getnum1(){
	
			return Double.parseDouble(t1.getText());
		}
		public double getnum2()
		{
			return Double.parseDouble(t2.getText());

		}
		public void setResult(double r)
		{
			t3.setText(""+r);
			
		}
		
	   public void calcListener(ActionListener h){
			 additionLabel.addActionListener(h); 
		    stractLabel.addActionListener(h);  
		    multiLabel.addActionListener(h); 
		     divideLabel.addActionListener(h); 
				}
		
		 void displayErrorMessage(String errorMessage){
				
		        JOptionPane.showMessageDialog(this, errorMessage);
		
		    }

		
		
		
		
		
		
		
		}
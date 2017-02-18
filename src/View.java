import java.awt.BorderLayout;
import java.awt.event.ActionListener;
	import javax.swing.*;
	public class View extends JFrame {
		
		private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
		
		    private JLabel additionLabel,stractLabel ,multiLabel,divideLabel;
		    private JButton calculate;
		    private  JPanel p1,p2,p3,p4;
		      
		    
		public View(){
			super("SimpleCalculator");
			 additionLabel = new JLabel("+");
		    stractLabel = new JLabel("-");
		    multiLabel = new JLabel("*");
		     divideLabel = new JLabel("/");
		     calculate= new JButton("calculate");
		     t1= new JTextField(10);
		     t2= new JTextField(10);
		     t3= new JTextField(10);
		     t4= new JTextField(10);
		     t5= new JTextField(10);
		     t6= new JTextField(10);
		     t7= new JTextField(10);
		     t8= new JTextField(10);
		     t9= new JTextField(10);
		   //  t10= new JTextField(10);
		     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setVisible(true);
				this.setSize(430,300);
				this.setResizable(true);
				p1= new JPanel();p2= new JPanel();
				p3= new JPanel();
				p4= new JPanel();
				
				
		     p1.add(t1);p1.add(additionLabel);p1.add(t2); 
		     p2.add(t3);p2.add(stractLabel);p2.add(t4);
		     p2.add(t5);p2.add(multiLabel);p2.add(t6); 
		     p3.add(t7);p3.add(divideLabel);p2.add(t8);
		    p4.add(calculate);   p4.add(t9);
		    
		    add(p1,BorderLayout.NORTH);
			add(p2,BorderLayout.CENTER);
			add(p3,BorderLayout.CENTER);
			add(p4,BorderLayout.SOUTH);
			
		     
		}
		    public double getFirstNumber(){
		
		        return Double.parseDouble(t1.getText());
		}
		  public double getSecondNumber(){
		        return Double.parseDouble(t2.getText());
		}
		  public double get3Number(){
			
	        return Double.parseDouble(t3.getText());
	}
		public double get4Number(){
			
	        return Double.parseDouble(t4.getText());
	}
		public double get5Number(){
			
	        return Double.parseDouble(t5.getText());
	}
		public double get6Number(){
			
	        return Double.parseDouble(t6.getText());
	}
		public double get7Number(){
			
	        return Double.parseDouble(t7.getText());
	}
		public double get8Number(){
			
	     return  Double.parseDouble(t8.getText());
	}
		
		  
		  public double getResult(){
		
		        return Double.parseDouble(t9.getText());
		    }
		
		    public void setResult(double r){
		
		    	t1.setText(""+r);
		
		    }
		
		    void addCalculateListener(ActionListener h){
		
		        calculate.addActionListener(h);
		
		    }
		
		
		    void displayErrorMessage(String errorMessage){
		
		        JOptionPane.showMessageDialog(this, errorMessage);
		
		    }
		    
		
		
}
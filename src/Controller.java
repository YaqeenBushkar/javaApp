import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

 

public class Controller {

    private  SimpleCalc View;

    private  Model model;

    public Controller(SimpleCalc View,  Model model) {

        this.View = View;

        this.model = model;

        this.View.calcListener(new CalculatorListener());

    }

   private class CalculatorListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            double firstNumber, secondNumber ,  res =0.0; String k;

            try{  
            	if(e.getActionCommand()==("+")){
                firstNumber = View.getnum1();
                secondNumber = View.getnum2();
                res= model.addTwoNumbers(firstNumber, secondNumber);
                  View.setResult(res); 
                
            	}
            	
            	else if(e.getActionCommand()==("-")){
            		
            	    	 firstNumber = View.getnum1();
                         secondNumber = View.getnum2();
                         if(secondNumber >0.0){
                         res= model.stractTwoNumbers(firstNumber, secondNumber);
                           View.setResult(res);}
                         else {
                        	 JOptionPane.showMessageDialog(null, "you canot divide over zero");
                         }
            	}
            	
            	else if (e.getActionCommand()==("*")){
            		firstNumber = View.getnum1();
                         secondNumber = View.getnum2();
                         res= model.multiTwoNumbers(firstNumber, secondNumber);
                           View.setResult(res);
            	}
            	if(e.getActionCommand()==("/")){
            	    	 firstNumber = View.getnum1();
                         secondNumber = View.getnum2();
                         res= model.divideTwoNumbers(firstNumber, secondNumber);
                           View.setResult(res);
            	     
            	}
            }
 
          catch(NumberFormatException ex){

                System.out.println(ex);

                View.displayErrorMessage("You Need to Enter 2 Integers");

            }
      }

    }

}


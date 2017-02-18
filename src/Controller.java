import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 

public class Controller {

    private View theView;

    private Model theModel;

    public Controller(View theView, Model theModel) {

        this.theView = theView;

        this.theModel = theModel;

        this.theView.addCalculateListener(new CalculatorListener());

    }

   private class CalculatorListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            double firstNumber, secondNumber ,tnum,fnum,finum,snum,senum,einum , res =0.0;

            try{
                    
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                res= theModel.addTwoNumbers(firstNumber, secondNumber);
                  theView.setResult(res);
                
                  
            }
 
          catch(NumberFormatException ex){

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers");

            }
      }

    }

}
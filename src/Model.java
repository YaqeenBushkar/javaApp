public class Model {
	private static double result;
	 
    public static double addTwoNumbers(double firstNumber, double secondNumber){

        result = firstNumber + secondNumber;
return result;
    }
   
    public static double stractTwoNumbers(double tnum, double fnum ){
		
        result = tnum - fnum;
return result;
    }
    public static double multiTwoNumbers(double finum, double snum){
		
       result =finum *  snum;
return result;
    }
    public static double divideTwoNumbers(double senum , double einum){
		if (einum== 0)
			throw new IllegalArgumentException("Cannot divide by 0!");
return result= senum/einum;

    }

	
}

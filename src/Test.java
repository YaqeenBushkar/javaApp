import javax.swing.JFrame;

public class Test {
	  public static void main(String[] args) {
		 
		          View theView = new View();
		  
		          Model theModel = new Model();
		  
		         Controller theController = new Controller(theView,theModel);
		         theView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		         theView.setVisible(true);
		         theView.setSize(430,300);
		      }

}
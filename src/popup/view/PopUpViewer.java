package popup.view;

import javax.swing.JOptionPane;

/**
 * Popup class display class with three methods for GUI.
 * @author Arick Smith
 * @version September 27, 2016
 */
public class PopUpViewer 
{
	/**
	 * Makes a popup message to show a user a String.
	 * @param message The String to show the user.
	 */
	
 public void displayMessage(String message)
 {
	 
	 JOptionPane.showMessageDialog(null, message);
	 //will replace the null when a owner is made
 }
 
 
 /**
  * Creates a popup to ask a question to the User. question Stores response as a string.
  * @param question that is supplied to the user.
  * @return The users response as s string
  */
 public String collectResponse(String question)
 {
	 String response = "";
	 
	 response = JOptionPane.showInputDialog(null, question);
	 
	 return response;
 }
 
 /**
  * Creates a popup to prompt user to choose yes no or cancel to a supplied question.
  * @param question e question being asked.
  * @return The JOPtionPane constant value for yes/no/cancel.
  */
 
 public int collectOption(String question)
 {
	 int optionNumber = 0;
	 
	 optionNumber = JOptionPane.showConfirmDialog(null, question);
	 
	 return optionNumber;
 }
 
}

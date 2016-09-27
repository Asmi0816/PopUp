package popup.view;

import javax.swing.JOptionPane;


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
 
}

package popup.controller;

import popup.view.PopUpViewer;

public class PopUpController 

{
	private PopUpViewer display;
	
	public PopUpController()
	{
		
		display = new PopUpViewer();
		
	}
	
	public void start()
	
	{
		
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{
		display.displayMessage("Hello World!!!");
		
		answer = display.collectResponse("What is your favorite Food?");
		
		
		}
		
	}
	/**
	 * Checks a supplied string value to see if it can be converted to a double.
	 * @param potentialValue The supplied string.
	 * @return Whether the conversion to a double is a possible as a boolean value.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean validDouble = false;
		
		try
		{
			double testValue = Double.parseDouble(potentialValue);
			validDouble = true;
		}
		
		catch(NumberFormatException notDoubleError)
		{
			display.displayMessage("This isn't a double or valid answer.");
		}
		
		return validDouble;
				
	}
	/**
	 * Checks a supplied string to see if it can be converted into a integer.
	 * I it cannot a PopUp is displayed.
	 * @param potentialValue The supplied String.
	 * @return Whether a conversion to an integer is possible.
	 */
	private boolean isInteger(String potentialValue)
	{
		boolean validInt = false;
		
		try 
		{
			int testValue = Integer.parseInt(potentialValue);
			validInt = true;
		}
		
		catch (NumberFormatException notIntegerError)
		{
			display.displayMessage(notIntegerError.getMessage());
			display.displayMessage("You need to put in a number");
		}
		
		
		return validInt;
		
		
	}
}

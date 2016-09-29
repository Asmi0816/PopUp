package popup.controller;

import popup.view.PopUpViewer;
import java.util.List;
import popup.model.Thingy;
import java.util.ArrayList;


public class PopUpController 

{
	private PopUpViewer display;
	
	private  List<Thingy> thingyList;
	
	
	
	
	
	public PopUpController()
	{
		
		display = new PopUpViewer();
		thingyList = new ArrayList<Thingy>();
		
	}
//the start call---------------------------------------------------------------------------------
	
		public void start()
	
	{
		
	learnLists();

	
	}
		
		
//things we did with try catch-------------------------------------------------------------------
		
	//Thing that creates the popups and tests them.
	private void askQuestionLoop()
	
	{
		String answer = "sample";
		
		while(answer != null && !isDouble(answer))
		{
		
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
	
	
//lists-------------------------------------------------------------------------------------------
	
	private void learnLists()
	{
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy firstThingy = new Thingy();
		thingyList.add(firstThingy);
		
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy newThingy = new Thingy();
		thingyList.add(newThingy);
		
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy lastThingy = new Thingy();
		thingyList.add(lastThingy);
		
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy psychThingy = new Thingy();
		thingyList.add(psychThingy);
		
		display.displayMessage("This will be my final Thingy! _____\\.=.|||||||: " + thingyList.size());
	}
	
	
	
	
	
	
	
	
	
	
}

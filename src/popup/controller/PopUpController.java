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
    askQuestionLoop();
	
	}
		
		
//things we did with try catch-------------------------------------------------------------------
		
	//Thing that creates the popups and tests them.
	private void askQuestionLoop()
	
	{
		String answer = "sample";
		
		while(answer != null && !isDouble(answer))
		{
		
			answer = display.collectResponse("What is your favorite Number?");
		    Thingy thingy = new Thingy();
		    thingy.setLanguage(answer);
		    thingyList.add(thingy);
		    display.displayMessage("You added " + answer + " to the list");
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
		
		for (int index = 0; index < 5; index++)
		{
			Thingy loopThingy = new Thingy();
			thingyList.add(loopThingy);
		}
		
		for	(int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage("The thingy at this spot has words of: " + thingyList.get(index).getLanguage());
		}
		
		Thingy specialThingy = new Thingy();
		specialThingy.setLanguage("Not null stuff.");
		
		thingyList.add(1, specialThingy);
		
		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage("the message at " + index + " is " +thingyList.get(index).getLanguage());
			
		}
		
		
		thingyList.get(3).setLanguage("I just put words in here XD");
		Thingy tempThing = thingyList.get(4);
		tempThing.setLanguage("Changed again");
		
		for (int index =0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getLanguage());
		}
		
		Thingy replacement = new Thingy();
		replacement.setLanguage("Be assimilated");
		
		Thingy old = thingyList.set(0, replacement);
		
		for (int index =0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getLanguage());
		}
		old.setLanguage("No chance for escape");
		display.displayMessage(old.getLanguage());
		
		thingyList.remove(4);
		display.displayMessage("The size of the list just shrunk to: " + thingyList.size());
		old = thingyList.remove(4);
		display.displayMessage("The size of the list just shrunk to: " + thingyList.size());
		display.displayMessage("this is what's missing: " + old.getLanguage());
		thingyList.add(0, old);
		
		//FreePlay----------------------------------------------------------------------------
		

		
		for (Thingy currentThingy : thingyList)
		{
			display.displayMessage("The current value is " + currentThingy.getLanguage());
		}
		
		
		for (Thingy currentThingy : thingyList)
		{
			currentThingy = new Thingy();
		}
		
		for (Thingy currentThingy : thingyList)
		{
			thingyList.remove(0);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

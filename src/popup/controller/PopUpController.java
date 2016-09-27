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
		int count = 0;
		String answer = "sample";
		while(!answer.equals(""))
		{
		display.displayMessage("Hello World!!!");
		
		answer = display.collectResponse("What is your favorite Food?");
		
		count++;
		}
	}
	
}

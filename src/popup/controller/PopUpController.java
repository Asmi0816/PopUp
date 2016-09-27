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
		while(count < 10)
		{
		display.displayMessage("Hello World!!!");
		
		String answer = display.collectResponse("What is your favorite Food?");
		
		count++;
		}
	}
	
}

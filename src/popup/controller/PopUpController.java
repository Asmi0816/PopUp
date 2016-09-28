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
	
}

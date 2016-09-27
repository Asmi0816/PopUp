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
		display.displayMessage("Hello World!!!");
	}
	
}

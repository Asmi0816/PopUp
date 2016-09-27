package popup.model;



public class Thingy 
{
	private String language;
	private boolean compare;
	private int number;
	private double decimal;
	
	public Thingy()
	{
		this.number = 234423;
		this.compare = true;
		this.language = "wefn";
		this.decimal = 2342.234;
	}
	
	
	//Getters---------------------------------------------------------------
	public String getLanguage()
	{
		return language;
	}
	
	public boolean getCompare()
	{
		return compare;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public double getDecimal()

	{
		return decimal;
	}
	
	//Setters-----------------------------------------------------------------
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public void setCompare(boolean compare)
	{
		this.compare = compare;
	}
	
	public void setDecimal(double decimal)
	{
		this.decimal = decimal;
	}
	
	public void setLanguage(String language)
	{
		this.language = language;
	}
	
	
	
	
	
}

package popup.model;



public class PopUpModel 
{
	private String language;
	private boolean compare;
	private int number;
	private double decimal;
	
	public PopUpModel()
	{
		this.number = 234423;
		this.compare = true;
		this.language = "wefn";
		this.decimal = 2342.234;
	}
	
	
	
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
	
	public PopUpModel(int number, boolean compare, double decimal, String language)
	{
		this.number = 23;
		this.compare = true;
		this.decimal = 23.23;
		this.language = "Munchy";
	}
	
}

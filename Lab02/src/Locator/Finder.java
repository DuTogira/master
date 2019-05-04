package Locator;
/**
 * 
 * @author Ankita
 *
 */
public class Finder
{
	private int ID;
	private String location;
	
	//Finder constructed using Tag Object
	public Finder(Tags A)
	{
		this.ID = A.getId();
		this.location = A.getLocation(); 
	}
	//Returns ID
	public int getID()
	{
		return ID;
	}
	//Returns Location
	public String getLocation()
	{
		return location;
	}
}
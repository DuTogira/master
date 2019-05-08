package Locator;

/**
 * Class that represents the tag on a device that sends the signal. 
 * 
 * @author Kees van Muyden
 */
public class Tags 
{
	private int Id;
	private String location;
	private boolean status;
	
	public Tags(int finderDeviceID, String location)
	{
		this.Id = finderDeviceID;
		this.location = location;
		//false means don't run finder 
		this.status = false;
	}
	public int getId()
	{
		return Id;
	}
	//return location
	public String getLocation()
	{
		return location;
	}
	//set new ID
	public void setId(int newID)
	{
		Id = newID;
	}
	//set new status
	public void setStatus (boolean newStatus)
	{
		status = newStatus;
	}
	
	public boolean getStatus () {
		return this.status;
	}
}

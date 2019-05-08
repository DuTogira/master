
package Locator;

/** 
 * This class contains functions:
 * gotLost: Set itemLost to true
 * status_Lost: Returns true if item status is lost
 * status_Found: Returns true if item status is found
 * Returns
 * 
 * @author - Matthew Calderon
 * 
 */

public class Owner
{
	private boolean itemLost;
	private boolean itemFound;
	
	//constructor set flags flags
	public Owner()
	{
		this.itemLost = false;
		this.itemFound = false;
	}
	public void gotLost()
	{
		this.itemLost=true;
	}
	public boolean status_Lost()
	{
		return this.itemLost;
	}
	public boolean status_Found()
	{
		return this.itemFound;
	}
	//return found, runs when found
	public void Found ()
	{
		System.out.println("\nObject was found!");
		
		this.itemLost = false;
		this.itemFound = true;
		
		System.out.println("\nitemLost="+this.itemLost
							+ "\nitemFound="+this.itemFound);
	}
}

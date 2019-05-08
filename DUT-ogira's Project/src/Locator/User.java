package Locator;

/**
 * class to represent the user
 * 
 * @author Austin Smothers
 *
 */

public class User{
	
	private int finderDeviceID;
	private Owner itemOwner;
	
	public User(String userName, int deviceID, Owner locator) {
		this.setDeviceID(deviceID);
		this.itemOwner = locator;
	}

	public void gotLost() {
		Tags userTag = new Tags(this.getDeviceID(), "placeholder");
		userTag.setStatus(true);
		this.itemOwner.gotLost();
	}

	public void FOUND() {
		// TODO Auto-generated method stub
		this.itemOwner.Found();
	}
	
	public void setDeviceID(int deviceID) {
		this.finderDeviceID = deviceID;
	}
	
	public int getDeviceID() {
		return this.finderDeviceID;
	}
	
}
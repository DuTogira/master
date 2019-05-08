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
	private Tags itemTag;
	
	public User(String userName, int deviceID, Owner locator) {
		this.setDeviceID(deviceID);
		this.itemOwner = locator;
	}

	public void gotLost() {
		Tags userTag = this.getItemTag();
		userTag.setStatus(true);
		this.itemOwner.gotLost();
	}

	public void FOUND() {
		this.itemOwner.Found();
		Tags userTag = this.getItemTag();
		userTag.setStatus(false);
	}
	
	public void setDeviceID(int deviceID) {
		this.finderDeviceID = deviceID;
	}
	
	public int getDeviceID() {
		return this.finderDeviceID;
	}
	
	public void setItemTag(int deviceID) {
		Tags userTag = new Tags(this.getDeviceID(), "placeholder");
		this.itemTag = userTag;
	}
	
	public Tags getItemTag() {
		return this.itemTag;
	}
	
}
package Locator;

import java.util.Scanner;
/**
 * Instantiates other classes and Runs application
 * Does the file reads and writes
 * 
 * @author Mikhael Oreiro
 *
 */
public class Server {

	public static void main(String[] args) throws InterruptedException{
		
		boolean appOn = true;
		Scanner client = new Scanner(System.in);
		while (appOn==true) {
			Owner locaterUser = new Owner();
			
			System.out.println("Input username:");
			String userName = client.next();
			User appUser = new User(userName, 48382924, locaterUser);
			System.out.printf("\nWelcome %s, your item has been registered\n", userName);
			System.out.println("Is your item lost? (1:\'Yes\' 2:\'No\'):");
			String answer = client.next();
			
			if (answer.equals("1")) {
				appUser.gotLost();
			} else {appOn = false;}
			
			Thread.sleep(3000);
			System.out.println("\nSending out signal to nearby devices\n");
			Thread.sleep(5000);
			System.out.println("Signal has reached the server. Now locating...\n");
			Thread.sleep(3000);
			Tags T1 = new Tags(1234,"Latitude: 37.961632, Longitude: -121.275604");
			Thread.sleep(3000);
			if (T1.getStatus()) { // only run finder if status is true
				Finder F1 = new Finder(T1); // "FINDER WILL EMAIL"
				appUser.FOUND();
				System.out.printf("\nItem has been located at: %s\n\n",F1.getLocation());
			}
			
			appOn = false;
		}
		
	}

}

package Raneem_code.eventDriven;
import javax.swing.*;

import javax.swing.JOptionPane;

public class EventDriven {
public static void main(String[] args) {
		
	    // String variable to hold the welcome message
	    String welcome = "Welcome to Game Company";
			
	    // Display a dialog box with the welcome message
	    JOptionPane.showMessageDialog(null, welcome);

	    // Prompt the user to enter their name and store it in a variable
	    String name = JOptionPane.showInputDialog("Enter your name:");

	    // Prompt the user to enter their age and store it as a string
	    String ageString = JOptionPane.showInputDialog("Enter your age:");

	    // Prompt the user to enter their major and store it as a string
	    String majorString = JOptionPane.showInputDialog("Enter your major:");
	        
	    // Convert the age string to an integer
	    int age = Integer.parseInt(ageString);
	        
	    String developer = null;
	    String managerString = null;
	        
	    // Check if the major is "developer" and assign it to the developer variable
	    if (majorString == "developer")
	        majorString = developer;
	        
	    // Check if the major is "manager" and assign it to the managerString variable
	    if (majorString == "manager")
	        majorString = managerString;
	        
	    // Create a message string with the user's name, age, and major
	    String message = "Name: " + name + "\nAge: " + age + "\nMajor: " + majorString;
	       
	    // Create an instance of the GameCompanyEventDriven class (not shown in the provided code)
	    new EventDriven();
	    
	    // Display a dialog box with the final message
	    JOptionPane.showMessageDialog(null, message);
	}
}

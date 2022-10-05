package phoneList;

import java.util.ArrayList;
import java.util.Scanner;

import notes02_ArrayLists.Student;

/*
 * Phone List
 * 
 * You'll be using an ArrayList of Contact objects
 * to crate a digital address book.
 * 
 * You MUST
 *   - Use an ArrayList
 *   - Keep list in alphabetical order
 *   - Complete the 
 *   
 * You May
 *   - Add methods as you see fit
 *   - Change method parameters and return types
 *   
 * You May NOT
 *   - change the menu method
 *        unless you're changing what methods it calls
 * 
 */


public class PhoneList {
	private ArrayList <Contact> contactsList;

	/*
	 * Instance Variables
	 */
	
	
	
	//Constructor
	public PhoneList() {
		//initialize instance variables
		contactsList = new ArrayList<Contact>();
	}
	
	
	/*
	 * This should do the following
	 * (whatever order you feel is best)
	 *   - ask the user for contact's name and number
	 *   - create a new Contact object with that input
	 *   - add that object to the phone list
	 *        in alphabetical order
	 *        Hint: compareTo(String other)
	 *   - tell the user what the new contact is and that 
	 *        it's been added
	 */
	public void addContact() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("New Contact's Name: ");
		//scan from the keyboard
		String name = inKey.nextLine();
		
		System.out.print("New Contact's Number: ");
		//scan from the keyboard
		String num = inKey.nextLine();
		
		System.out.print("Contact has been added.");
		
		Contact c1 = new Contact(name, num);
		
		boolean added = false;
		
		if (contactsList.size() == 0) {
			contactsList.add(c1);
		}
		else {
			for (int i = 0; i < contactsList.size(); i++) {
				if(c1.getName().compareTo(contactsList.get(i).getName()) <= 0) {
					contactsList.add(i, c1);
					added = true;
					break;
				}
			}
		}
		if (added = false) {
			contactsList.add(c1);
		}
		
		
	}
	
	
	
	/*
	 * This should do the following
	 * (whatever order you feel is best)
	 *   - ask the user for the contact's name
	 *   - search through the list for that contact
	 *   - if the contact is not found
	 *        tell the user and end the method
	 *   - if the contact is found
	 *        Remove the item from the list
	 *        Print the contact's name and number
	 *        Say that contact has been removed
	 *        Remove the item from the list
	 *        
	 */
	public void removeContact() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Name of contact that you want to remove: ");
		//scan from the keyboard
		String name = inKey.nextLine();
		
		System.out.print("Contact has been removed.");
		
	
			for (int i = 0; i < contactsList.size(); i++) {
				if(name.compareTo(contactsList.get(i).getName()) == 0) {
					contactsList.remove(i);
				}
			}
		
		
		
	}
	
	
	/*
	 * This should
	 *   - Print all items in list
	 *   - Must be headers for all columns
	 *   - print in alphabetical order
	 *   - print line of something to "box" the list
	 *       Examples:
	 *          *****************
	 *          -----------------
	 *          #################
	 */
	public void printList() {
		for (int i = 0; i < contactsList.size(); i++) {
			System.out.println("-----------------\nName: " + contactsList.get(i).getName() + "\nNumber: " + contactsList.get(i).getNum() + "\n-----------------");
			
		}
	}

	
	
	/*
	 * GET FAMILIAR WITH THIS MENU!!!!
	 * 
	 * I will be asking you to create programs with menus.
	 * You may do them however you like.  But here is an example
	 * of how to manage them.
	 * 
	 */
	public void menu() {
		
		int input = 0;
		
		String menu = "-----------------------\n"
				    + "     Contacts Menu     \n"
				    + "-----------------------\n"
				    + "  1 - Add Contact      \n"
				    + "  2 - Remove Contact   \n"
				    + "  3 - Print List       \n"
				    + "  4 - Quit             \n\n"
				    + "Enter Choice: ";
		
		while (input != 4) {  //keep looping till user want's to quit
			
			//try getting an input
			try {
				String inputString = getString("\n" + menu);  //get input
				input = Integer.valueOf(inputString);  //try converting to int
			}
			catch (Exception e) {
				//if bad input, set input to 0
				input = 0;  
			}
		
			switch (input) {
			case 1:
				//handle menu line 1: Add Contact
				addContact();
				break;
			case 2:
				//handle menu line 2: Remove Contact
				removeContact();
				
				break;
			case 3:
				//handle menu line 3: Print List
				printList();
				break;
			case 4:
				//handle menu line 4: Quit
				System.out.println("\nGodbye!");
				break;
			default:
				System.out.println("\nNot a valid input.\n"
								 + "Please try again.");
			}
			
			
		
		}
		
	}
	
	public String getString(String str) {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print(str);  //notice it's NOT a print line.  This way input is next to question.
		return inKey.nextLine();
		
	}
	
	
	public static void main(String[] args) {
		PhoneList app = new PhoneList();
		app.menu();
	}
}

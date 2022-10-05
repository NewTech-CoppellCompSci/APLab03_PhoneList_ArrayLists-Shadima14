package phoneList;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */



public class Contact {
	private String name;
	private String num;
	
	public Contact(String name, String num) {
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public String getNum() {
		return num;
	}
	public String toString() {
		return name + ": " + num;
	}
	

}

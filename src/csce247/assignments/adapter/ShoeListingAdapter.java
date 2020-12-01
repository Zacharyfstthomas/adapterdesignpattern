package csce247.assignments.adapter;
/**
 * This class is used to ensure that the Shoe items can be present in the store alongside the 
 * other regular products. Takes advantage of specific flags within the Shoe toString.
 * Uses an instance of shoe, and its own title, brand, description, and price.
 * @author zacharystthomas
 *
 */
public class ShoeListingAdapter implements ProductListing{

	private ShoeListing shoe;
	private String title;
	private String brand;
	private String description;
	private double price;
	/**
	 * Constructor.
	 * Uses the internal flags of shoe to select a specific substring to set title, brand and description to.
	 * To set price, a substring, found using the flags, is parsed as a double. 
	 * @param shoe: The Shoe instance to set this instance's shoe variable.
	 */
	public ShoeListingAdapter(ShoeListing shoe){
		
		this.shoe = shoe;
		this.title = shoe.toString().substring(shoe.toString().indexOf("\1") + 1, shoe.toString().indexOf("\n"));
		this.brand = shoe.toString().substring(shoe.toString().indexOf("\2") + 1, shoe.toString().indexOf("\3") - 1);
		this.description = shoe.toString().substring(shoe.toString().indexOf("\4") + 1, shoe.toString().indexOf("\5") - 1);;
		this.price = Double.parseDouble(shoe.toString().substring(shoe.toString().indexOf("\6") + 1, shoe.toString().length()));
	}
	/**
	 * Returns the value of the title variable
	 */
	public String getTitle() {
	
		return title;
	}

	/**
	 * Returns the value of the price variable
	 */
	public double getPrice() {
	
		return price; 
	}
	/**
	 * Returns a custom string, using the values of the brand variable and the description variable.
	 */

	public String getDescription() {
		
		return "Created by " + this.brand + ", "+ this.description;
	}

	
	
	
}

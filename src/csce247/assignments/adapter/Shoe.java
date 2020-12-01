package csce247.assignments.adapter;
/**
 * The shoe class is a unique product that needs special consideration in the store.
 * It has a brand, name, cost, and description, with its own unique toString.
 * To ensure this works in the store like the rest of the items, it is handled seperately.
 * @author zacharystthomas
 *
 */
public class Shoe implements ShoeListing{
	
	private String brand;
	private String name;
	private double cost;
	private String description;
	/**
	 * Constructor. 
	 * @param brand  This instance's brand is set as this parameter.
	 * @param name This instance's name is set as this parameter.
	 * @param price  This instance's price is set as this parameter.
	 * @param description  This instance's description is set as this parameter.
	 */
	public Shoe(String brand, String name, double price, String description) {
		this.brand = brand;
		this.name = name;
		this.cost = price;
		this.description = description;
	}
	/**
	 * Returns a string message which displays the class variables.
	 * Has numbered invisible flags to be used by ShoeListingAdapter, but will not print out.
	 * 
	 */
	public String toString() {
		
	
		return "Shoe: \1" + this.name +"\nBy: \2"+this.brand + "\3\nDetails: \4" + this.description + "\5\nCost: $\6" + this.cost;
	}

}

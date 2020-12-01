package csce247.assignments.adapter;
/**
 * 
 * Product represents a generic product in the store. These have a a title, price, and description,
 * all of which represent the attributes of the product.
 * @author zacharystthomas
 *
 */
public class Product implements ProductListing{

	private String title;
	private double price;
	private String description;
	
	/**
	 * Constructor
	 * @param title : This instance's title is set as this parameter.
	 * @param price  This instance's price is set as this parameter.
	 * @param description  This instance's description is set as this parameter.
	 */
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
		
	}
	/**
	 * Returns this instance's title variable.
	 */
	public String getTitle() {
	
		return this.title;
	}

	/**
	 * Returns this instance's price variable.
	 */
	public double getPrice() {
			return this.price;
	}

	/**
	 * Returns this instance's description variable.
	 */
	public String getDescription() {
	
		return this.description;
	}
	

}

/**
 * Lab 4: Product.java
 * An object that has the fields name, description, category, productID, and price
 * CS496
 * 3/20/2016
 * @author Steven Duong
 */
package lab4;
public class Product {

	private String name, description, category, productID;
	private double price;

	/**
	 * Creates a new Product object
	 * @param name the name of the Product
	 * @param description the description of the Product
	 * @param productID the ID of the Product as a String
	 * @param price the price of the product
	 */
	public Product(String name, String description, String productID, double price) {
		this(name, description, productID, "", price);
	}

	/**
	 * Creates a new Product object with an optional category
	 * @param name the name of the Product
	 * @param description the description of the Product
	 * @param productID the ID of the Product as a String
	 * @param category the category of the Product as a String
	 * @param price the price of the product
	 */
	public Product(String name, String description, String productID, String category, double price) {
		this.name = name;
		this.description = description;
		this.productID = productID;
		this.price = price;
		this.category = category;
	}

	/**
	 * Gets the name of the product
	 * @return the name of the product
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets the product description
	 * @return the description of the product
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Gets the category of the product, if any
	 * @return the category of the product (optional)
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * Gets the product ID as a number
	 * @return the product ID
	 */
	public String getProductID() {
		return this.productID;
	}

	/**
	 * Gets the price of the product
	 * @return the price of the product
	 */
	public double getPrice() {
		return this.price;
	}

}

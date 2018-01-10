/**
 * Lab 4: Inventory.java
 * A HashMap called Dictionary that contains Integer.
 * Inventory adds Items to the cart.
 * CS496
 * 3/20/2016
 * @author Steven Duong
 */

package lab4;
/**
 * A shared class that we will use to "become" our inventory and our cart
 */
public class Inventory {
	private Dictionary<Integer> inventory;

	
	/**
	 * Default Constructor. Initializes a Dictionary object.
	 */
	public Inventory() {
		this.inventory = new Dictionary<>();
	}
	
	/**
	 * Adds a product to the inventory
	 * @param product the product to be added
	 * @param quantity the number of products to be added
	 */
	public void add(Product product, int quantity) {
		inventory.add(product, quantity);
	}

	/**
	 * Removes a product in Inventory
	 * @param product the product to be removed
	 * @return the data stored in product
	 */
	public Integer remove(Product product) {
		return inventory.remove(product);	
	}

	/**
	 * Remove a certain number of products in Inventory
	 * @param product the product to be removed
	 * @param quantity the number of products to remove
	 * @return inventory after products have been removed
	 */
	public boolean remove(Product product, int quantity) {
		return inventory.remove(product, quantity);
	}

	
	/**
	 * Update the quantity of the product in Inventory
	 * @param product the product in inventory
	 * @param quantity the number of products in inventory
	 */
	public void updateQuantity(Product product, int quantity) {
		this.inventory.remove(product); 					// remove product
		this.inventory.add(product, quantity);			    // add product with new quantity back to HashMap
	}

	/**
	 * Prints the inventory
	 */
	public void printInventory() {
		this.inventory.map.forEach((product, quantity) -> {
			System.out.printf("%s costs $%.2f and we currently have %d in stock\n", product.getName(), product.getPrice(), quantity);
		});
	}
}

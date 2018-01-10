/**
 * Lab 4: Cart.java
 * A HashMap called Dictionary that contains CartItem.
 * Cart adds cartItems to the cart.
 * CS496
 * 3/20/2016
 * @author Steven Duong
 */
package lab4;

public class Cart {
	private Dictionary<CartItem> cart;
	
	/**
	 * Default Constructor. Initializes the Dictionary object
	 */
	public Cart () {
		this.cart = new Dictionary<>();
	}
	
	
	/**
	 * Adds the product and a cart item to the cart
	 * @param product the product
	 * @param quantity the number of cart items
	 * @param coupon the coupon that comes with the cart item
	 */
	public void add(Product product, int quantity, String coupon) {
		cart.add(product, new CartItem(quantity, product.getPrice(), coupon));	//create a new CartItem using the given parameters
		
	}

	/**
	 * Adds the product and a cart item to the cart
	 * @param product the product
	 * @param quantity the number of cart items
	 */
	public void add(Product product, int quantity) {
		cart.add(product, new CartItem(quantity, product.getPrice(), ""));		//adds a cart item with no coupon/discount
	}

	
	/**
	 * Remove a product from the cart
	 * @param product the product to be removed
	 * @return the data stored in product that is removed
	 */
	public CartItem remove(Product product) {
		return cart.remove(product);
	}

	/**
	 * Removes a product if the product is mapped to the cart item
	 * @param product the product to remove
	 * @param item the value of cart item that is checked
	 * @return true if the product is removed
	 */
	public boolean remove(Product product, CartItem item) {
		return cart.remove(product, item);
	}

	/**
	 * Updates the existing quantity
	 * @param product the Product to search for in the Dictionary
	 * @param quantity the new quantity to set
	 */
	public void updateQuantity(Product product, int quantity) {
		CartItem item = this.cart.remove(product); 				// remove to get the item
		item.setQuantity(quantity); 							// set the new quantity

		this.cart.add(product, item); 							// add it back to the HashMap
	}

	/**
	 * Prints the cart
	 */
	public void printCart() {
		this.cart.map.forEach((product, cartItem) -> {
			System.out.printf("%d %ss are currently in our cart and we will be charged $%.2f per device\n", cartItem.getQuantity(), product.getName(), cartItem.getDiscountedPrice());
		});
	}

}

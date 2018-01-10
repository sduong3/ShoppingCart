package lab4;
import java.util.HashMap;
import java.util.Map;

/**
 * Our Dictionary classes implemented with a partial generic implementation.
 * Our key will always be a Product object if we use a Cart or an Inventory.
 * The only parameter that will change is what data we store at the key, hence E
 * @param <E> the generic parameter we store for the Product object
 * @author Dennis Thompson
 */
class Dictionary<E> {

	Map<Product, E> map; // scope for testing purposes

	public Dictionary() {
		this.map = new HashMap<>();
	}

	/**
	 * Adds a new Product and quantity to the storage container
	 * @param product the Product object to add
	 * @param value the value to store for the Product object
	 */
	public void add(Product product, E value) {
		this.map.put(product, value);
	}

	/**
	 * Remove Product from our data source
	 * @param product the Product to remove
	 * @return the data stored as the value for the Product key
	 */
	public E remove(Product product) {
		return this.map.remove(product);
	}

	/**
	 * Removes the entry for the specified key only if it is currently
	 * mapped to the specified value.
	 * @param product the Product to remove
	 * @param value the value to provide as a check
	 * @return true if the item was removed from our data source
	 */
	public boolean remove(Product product, E value) {
		return this.map.remove(product, value);
	}

	/**
	 * Updates the quantity to a new value by replacing the existing object
	 * @param product the Product to update
	 * @param value the object to update
	 */
	public void update(Product product, E value) {
		this.map.replace(product, value);
	}

}

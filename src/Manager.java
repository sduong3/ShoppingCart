package lab4;
/**
 * Forces us to adhere to the guidelines so we can create a true "manager"
 */
public interface Manager {

	/**
	 * Adds an element to the desired collection
	 * @param item the intended key to add
	 * @param number the intended value to add
	 */
	void add(String item, int number);

	/**
	 * Checks to see if the Object exists in the collection
	 * @param item the item to check
	 * @return true is the key exists in the collection
	 */
	boolean isValid(String item);

	/**
	 * Gets the data stored at the key
	 * @param item the key to get the value from
	 * @return the value stored at the key
	 */
	int get(String item);

	/**
	 * Removes data from the collection
	 * @param item the item to remove
	 * @return the data returned from the remove operation
	 */
	int remove(String item); 

}

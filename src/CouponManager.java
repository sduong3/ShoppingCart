/**
 * Lab 4: CouponManager.java
 * A HashMap that uses the String-Integer (key-value) pair.
 * Implements the Manager class
 * CS496
 * 3/20/2016
 * @author Steven Duong
 */
package lab4;
import java.util.HashMap;

public class CouponManager implements Manager{
	HashMap<String, Integer> couponManager;
	
	/**
	 * Default constructor. Initializes the HashMap object
	 */
	public CouponManager() {
		couponManager = new HashMap<>();
	}

	/**
	 * Adds the coupon to the HashMap
	 * @param item the coupon that is added
	 * @param number the value to be added to the coupon
	 * @Override
	*/
	public void add(String item, int number) {
		couponManager.put(item, number);
	}

	/**
	 * Checks if the coupon is present in the HashMap
	 * @param item the coupon to be checked
	 * @return true if coupon is exists in the HashMap
	 * @Override
	*/
	public boolean isValid(String item) {
		return couponManager.containsKey(item);
	}

	/**
	 * Gets the data stored in coupon
	 * @param item the coupon to get the value from
	 * @return the value in the coupon
	 * @Override
	*/
	public int get(String item) {
		return couponManager.get(item);
	}

	/** 
	 * Remove the coupon from the HashMap
	 * @param item the coupon to remove
	 * @return the data returned from the remove operation
	 * @Override
	*/
	public int remove(String item) {
		return couponManager.remove(item);
		
	}

}

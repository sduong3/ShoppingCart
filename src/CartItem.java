/**
 * Lab 4: CartItem.java
 * An object that contains the fields quantity, basePRice, discountedPrice, and coupon.
 * Implements the Item class
 * CS496
 * 3/20/2016
 * @author Steven Duong
 */
package lab4;
public class CartItem implements Item{

	private int quantity;
	private double basePrice, discountedPrice;
	private String coupon;

	/**
	 * Explicit value constructor. Sets fields to its parameters.
	 * Price of the cart item changes depending on the coupon.
	 * @param quantity the quantity of the cart item
	 * @param basePrice the base price of the cart item
	 * @param coupon the coupon of the cart item
	 */
	public CartItem(int quantity, double basePrice, String coupon) {
		this.basePrice = basePrice;
		this.coupon = coupon;
		this.quantity = quantity;
	    calcPrice();													
	}

	/**
	 * Gets the quantity of the cart item
	 * @return quantity
	 */
	public int getQuantity() {
		return this.quantity;
	}

	/**Sets the quantity of the cart item
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the original price of the cart item
	 * @return basePrice
	 */
	public double getBasePrice() {
		return this.basePrice;
	}

	/**
	 * Gets the discounted price of the cart item after the coupon is applied
	 * @return discountedPrice
	 */
	public double getDiscountedPrice() {
		return this.discountedPrice;
	}

	/**
	 * Gets the coupon that comes with the cart item
	 * @return coupon
	 */
	public String getCoupon() {
		return this.coupon;
	}

	/** 
	 * Calculates the price of the cart item after the coupon is applied
	 * @see lab4.Item#calcPrice()
	 *@Override
	*/
	public void calcPrice() {
		if (Lab4.couponManager.isValid(coupon)) {			     //if the given coupon is found in hashmap       
			if (Lab4.couponManager.get(coupon) == 10)                 //10 coupons are 10% off
				this.discountedPrice = this.basePrice * .90;            
			else if (Lab4.couponManager.get(coupon) == 100)           //100 coupons that make the price free
				this.discountedPrice = 0;                               
		}
		else													//no coupon. price is not discounted
			this.discountedPrice = this.basePrice;
	}
}

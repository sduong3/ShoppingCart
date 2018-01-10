package lab4;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lab4 {

	private static final int SEED = 234;
	private static final String[] PRODUCT_NAMES = {
			"PC", "XBox", "XBox One",
			"PS4", "PS3", "PS2", "Wii",
			"Wii U", "GameCube", "NES"
	};

	static Manager couponManager = new CouponManager();

	static {
		// populate coupons
		couponManager.add("10%OFF", 10);
		couponManager.add("FREESTUFF", 100);
	}

	public static void main(String[] args) {
		final Random rand = new Random(SEED);
		final Inventory inventory = new Inventory();
		final Cart cart = new Cart();

		// caching products for testing
		Set<Product> cache = new HashSet<>();

		for(String product : PRODUCT_NAMES) {
			Product prod = new Product(
					product,
					product + " description",
					"" + rand.nextInt(), // "convert" an integer to a String
					rand.nextInt(1000) // generate a random price [0, 999)
			);

			cache.add(prod);

			inventory.add(prod, rand.nextInt(100));
		}

		int i = 0;
		for(Product product : cache) {
			if(i == 6) break;
			String coupon = "";

			if(i == 3) coupon = "10%OFF";
			if(i == 1) coupon = "FREESTUFF";
			if(i == 4) coupon = "INVALID";

			cart.add(product, rand.nextInt(10), coupon);
			i++;
		}

		inventory.printInventory();
		System.out.println();
		cart.printCart();
	}

}

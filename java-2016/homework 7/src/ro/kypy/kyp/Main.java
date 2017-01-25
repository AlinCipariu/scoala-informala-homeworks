package ro.kypy.kyp;

/**
 * This is the main class
 *
 */
public class Main {
	/**
	 * This is the main method
	 *
	 */
	public static void main(String args[]) {

		Double[] a1 = { 0.12, 0.92, 0.23, .89, 0.42, 0.73, 0.34, 0.64, 0.51, 0.42, 0.5 };

		Object[] expectedEmps = new Object[3];

		expectedEmps[0] = new Employee(1, "Nats", 15000);
		expectedEmps[1] = new Employee(2, "Kalid", 25000);
		expectedEmps[2] = new Employee(3, "Krish", 5000);

		QuickSort<Double> qs1 = new QuickSort<>(a1, a1.length);

		qs1.sort(a1);
		qs1.displayArray(a1);
	}
}
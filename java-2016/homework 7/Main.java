

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
		Integer[] a2 = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
		String[] a3 = { "me", "she", "you", "he" };
		
		 
	   
		
		QuickSort<Double> qs1 = new QuickSort<>(a1, a1.length);
		QuickSort<Integer> qs2 = new QuickSort<>(a2, a2.length);
		QuickSort<String> qs3 = new QuickSort<>(a3, a3.length);
	
		
		qs1.sort(a1);
		qs1.displayArray(a1);
	}
}
package ro.kypy.kyp;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

	@Test
	public void unsortedIntegerArrayIsSorted() {
		// given
		Integer[] a2 = new Integer[] { 9, 1, 2, 7, 5, 6, 3 };
		QuickSort<Integer> qs2 = new QuickSort<>(a2, a2.length);
		qs2.sort(a2);
		// when
		Integer[] sortedArray = a2;
		// then
		Integer[] correctlySortedArray = new Integer[] { 1, 2, 3, 5, 6, 7, 9 };
		Assert.assertArrayEquals(correctlySortedArray, sortedArray);
	}

	@Test
	public void unsortedDoubleArrayIsSorted() {
		// given
		Double[] a1 = new Double[] { 9.3, 1.9, 2.2, 7.7, 5.7, 6.0, 3.8 };
		QuickSort<Double> qs1 = new QuickSort<>(a1, a1.length);
		qs1.sort(a1);
		// when
		Double[] sortedArray = a1;
		// then
		Double[] correctlySortedArray = new Double[] { 1.9, 2.2, 3.8, 5.7, 6.0, 7.7, 9.3 };
		Assert.assertArrayEquals(correctlySortedArray, sortedArray);
	}

	@Test
	public void unsortedStringArrayIsSorted() {
		// given
		String[] a3 = new String[] { "me", "she", "you", "he" };
		QuickSort<String> qs3 = new QuickSort<>(a3, a3.length);
		qs3.sort(a3);
		// when
		String[] sortedArray = a3;
		// then
		String[] correctlySortedArray = new String[] { "he", "me", "she", "you" };
		Assert.assertArrayEquals(correctlySortedArray, sortedArray);

	}

	@Test
	public void UnsortedArrayOfObjesctsIsSorted() {

		Object[] expectedEmps = new Object[3];

		expectedEmps[0] = new Employee(1, "Nats", 15000);
		expectedEmps[1] = new Employee(2, "Kalid", 25000);
		expectedEmps[2] = new Employee(3, "Krish", 5000);

		/**
		 * convert List of objects to array of objects
		 */
		Object[] testOutput = Employee.getEmpList().toArray();

		AssertArrayEquals(expectedEmps, testOutput);
	}

	private void AssertArrayEquals(Object[] expectedEmps2, Object[] testOutput) {

	}
}

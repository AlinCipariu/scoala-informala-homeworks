package ro.kypy.kyp;
/**
 * This class extends Comparable
 *
 */
public class QuickSort<T extends Comparable<T>> {
	T array[];
	int n;

	public void sort(T[] a) {
		n = a.length;
		array = a;
		quickSort(0, n - 1);
	}

	public void quickSort(int p, int q) {
		int j;
		if (p < q) {
			j = partition(p, q);
			quickSort(p, j - 1);
			quickSort(j + 1, q);
		}
	}

	
	
	public QuickSort(T[] array, int n) {
		super();
		this.array = array;
		this.n = n;
	}

	int partition(int p, int q) {
		T pivot = array[q];
		int i = p - 1;
		for (int j = p; j < q; j++) {
			if (array[j].compareTo(pivot) < 0) {
				// swap array[i+1] and array[j]
				i = i + 1;
				T temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		i = i + 1;
		T temp = array[i];
		array[i] = array[q];
		array[q] = temp;
		return i;
	}
	/**
	 * This method displays an sorted array 
	 *
	 */
	public void displayArray() {

		for (int i = 0; i < n - 1; i++)
			System.out.print(array[i] + " < ");
		System.out.println(array[n - 1]);
	}

	public void displayArray(T[] la) {
		int ln = la.length;
		for (int i = 0; i < ln - 1; i++)
			System.out.print(la[i] + " < ");
		System.out.println(la[ln - 1]);
	}
}
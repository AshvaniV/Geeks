//Reverse an array
package ds01.arrays.level1;

public class Arrays_05 {
	public static void arrayReversal(int a[], int n) {
		int i = 0;
		int j = n - 1;
		int temp = 0;
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}

	private static void arrayReverseWithRecusion(int array[], int start, int end) {
		if (start < end) {
			int temp = array[end];
			array[end] = array[start];
			array[start] = temp;
			arrayReverseWithRecusion(array, start + 1, end - 1);
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 3, 2, 4, 5, 6, 7, 6, 10, 100 };
		arrayReversal(a, a.length);
		printArray(a);
		System.out.println("\n********************************");
		arrayReverseWithRecusion(a, 0, a.length - 1);
		printArray(a);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
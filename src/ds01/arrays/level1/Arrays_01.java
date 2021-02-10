//Insert elements at given location
/*You need to insert the given element at the given index. After inserting the elements at index, elements from index 
onward should be shifted one position ahead. You may assume that the array already has sizeOfArray - 1 elements.*/

//It's always better to use Shifting operation whenever it's possible to do get solution in O(1) extra space

package ds01.arrays.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_01 {
	private static void insertAtIndexByUser(int[] arr, int sizeOfArray, int index, int element) {
		System.out.println("Array before inserting element: " + element + " at: " + index);
		printArray(arr);
		int lastElement = arr[arr.length - 1];
		for (int i = index; i < sizeOfArray - 1; i++) {
			int val = arr[i];
			arr[i] = element;
			element = val;
		}
		arr[arr.length - 1] = lastElement;
		System.out.println("\n Array after inserting element");
		printArray(arr);
	}

	private static void insertAtIndexByJava(List<Integer> arr, int sizeOfArray, int index, int element) {
		System.out.println("ArrayList before inserting element: " + element + " at: " + index);
		printArrayList(arr);
		Integer integerElement = element;
		arr.add(index, integerElement);
		System.out.println("\n ArrayList after inserting element");
		printArrayList(arr);
	}

	static void printArrayList(List<Integer> a) {
		for (Integer integer : a) {
			System.out.print(integer + " ");
		}
	}

	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6};
		Arrays_01.insertAtIndexByUser(arr1, arr1.length, 2, 100);

		System.out.println();
		ArrayList <Integer> arr2 = new ArrayList<Integer>( Arrays.asList(10,20,30,40,50,60));
		Arrays_01.insertAtIndexByJava(arr2, arr2.size() + 1, 2, 100);
	}
}

/*You are given an array arr[] of size N. You are also given two elements x and y. Now, you need to tell which element
 x or y) appears most in the array. In other words, print the element, x or y, that has highest frequency in the 
 array. If both elements have the same frequency, then just print the smaller element.*/

package ds01.arrays.level1;

public class Arrays_02 {
	private static void majorityWins(int a[], int n, int x, int y) {
		int count_x = 0; // counter to count frequency of x
		int count_y = 0; // counter to count frequency of y

		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				count_x++;
			} else if (a[i] == y) {
				count_y++;
			}
		}

		if (count_x > count_y)
			System.out.print(x);
		else if (count_y > count_x)
			System.out.print(y);
		else
			System.out.print(x < y ? x : y);
		System.out.println();
	}
	

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 4, 4, 5 };
		majorityWins(a, a.length, 2, 4);
	}
}

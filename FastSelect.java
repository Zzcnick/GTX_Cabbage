/* Zicheng Zhen
   APCS2 pd10
   HW31 -- Fast Selection / Finding the kth smallest integer
   2016-04-13 */

import java.util.Arrays; // Printing Utility

public class FastSelect {
    public static int kthSmallest(int[] arr, int pos) {
	if (pos < 1 || pos > arr.length)
	    throw new IndexOutOfBoundsException();
	return FSel(arr, pos-1, 0, arr.length);
    }
    public static int FSel(int[] arr, int pos, int low, int high) {
	// Partitioning About Index 0
	int pivotPos = low;
	for (int i = low; i < high; i++)
	    if (arr[i] < arr[pivotPos]) {
		int j = i;
		while (j > pivotPos) { // Moving Backwards
		    swap(arr, j, j-1);
		    j--;
		}
		pivotPos++;
	    }

	// After Partitioning, Check For Proper Position
	if (pivotPos > pos)
	    return FSel(arr, pos, low, high-1);
	if (pivotPos < pos)
	    return FSel(arr, pos, low+1, high);
	return arr[pivotPos];
    }
    public static void swap(int[] arr, int p1, int p2) {
	int old = arr[p1];
	arr[p1] = arr[p2];
	arr[p2] = old;
    }

    public static void main(String[] args) {
	int[] test = new int[10];
	for (int i = 0; i < 10; i++)
	    test[i] = (int)(Math.random() * 20);
	System.out.println("Before Partitioning:");
	System.out.println(Arrays.toString(test));

	System.out.println("Finding...");
	for (int i = 1; i <= test.length; i++) {
	    System.out.println("Smallest " + i + ":");
	    System.out.println(kthSmallest(test, i));
	}
    }
}

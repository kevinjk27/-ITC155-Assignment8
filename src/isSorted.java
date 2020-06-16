/*
 * 06/11/2020
 * Checks whether a linked list is sorted (non-decreasing) and returns true
 * An empty list is considered to be sorted. 
 */

public class isSorted {
	private static ListNode front; 

	public static boolean isSorted() {
		if (front == null) {
			return true;
		} 
		else {
			while (front.next != null) {
				ListNode duplicate = front.next; // taking the next data from "front' LinkedList (one index ahead)
				if (front.data > duplicate.data ) { // comparing "data[i]" vs "data[i+1]"
					return false;
				}
				front = duplicate;  // accumulator, similar to i++
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		ListNode test1 = new ListNode();
		test1.add(6);
		test1.add(-3);
		test1.add(5);
		System.out.println(test1.toString());
	}
	
}

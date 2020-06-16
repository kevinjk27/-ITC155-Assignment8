/*
 * 06/11/2020
 * Checks whether a linked list is sorted (non-decreasing) and returns true
 * An empty list is considered to be sorted. 
 */

// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class ListNode {
	public int data; // data stored in this node
	public ListNode next; // link to next node in the list

	// Reference to the first element:
	private ListNode head;

	// post: constructs a node with data 0 and null link
	public ListNode() {
		this(0, null);
	}

	// post: constructs a node with given data and null link
	public ListNode(int data) {
		this(data, null);
	}

	// post: constructs a node with given data and given link
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	ListNode front; ; // first value in the list

	// post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }
	

	public boolean isSorted() {
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
		test1.add(-632);
		test1.add(-528);
		test1.add(-348);
		test1.add(-72);
		test1.add(0);
		test1.add(-8);
		test1.add(9);
		System.out.println(test1.toString() +"\nis sorted: " +test1.isSorted());
		System.out.println();
		
		ListNode test2 = new ListNode();
		test2.add(49);
		test2.add(79);
		test2.add(103);
		test2.add(149);
		test2.add(195);
		System.out.println(test2.toString() +"\nis sorted: " +test2.isSorted());
		System.out.println();
		

		
		ListNode test3 = new ListNode();
		test3.add(-632);
		test3.add(-528);
		test3.add(-348);
		test3.add(-72);
		test3.add(-1);
		test3.add(0);
		test3.add(9);
		System.out.println(test3.toString() +"\nis sorted: " +test3.isSorted());
		System.out.println();
		
	}

}
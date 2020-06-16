// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // link to next node in the list
    
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


	public void add(int number) {
		ListNode newNode = new ListNode(number);
		newNode.data=number;
		newNode.next=null;
		// if list is empty
		if (head == null) {
			head = newNode;
		} else {
			ListNode last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
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
	
	public String toString() {
	    String result = data + " ";
	    if (next != null) {
	        result += next.toString();
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		ListNode test1 = new ListNode();
		test1.add(6);
		test1.add(-3);
		test1.add(5);
		System.out.println("Good "+test1.toString());
	}
	
}
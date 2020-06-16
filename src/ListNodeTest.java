import static org.junit.Assert.*;

import org.junit.Test;

public class ListNodeTest {

	@Test
	public void testIsSorted() {
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
		assertFalse(test1.isSorted());
		
		
		ListNode test2 = new ListNode();
		test2.add(49);
		test2.add(79);
		test2.add(103);
		test2.add(149);
		test2.add(195);
		System.out.println(test2.toString() +"\nis sorted: " +test2.isSorted());
		System.out.println();
		assertTrue(test2.isSorted());
		
				
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
		assertTrue(test3.isSorted());
	}

}

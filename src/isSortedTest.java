import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class isSortedTest {

	@Test
	public void testIsSorted() {

		ListNode test1 = new ListNode();
		test1.add(6);
		test1.add(-3);
		test1.add(5);
		System.out.println(test1.data);
		System.out.println(test1.toString());
		
		isSorted dr = new isSorted();
		assertFalse(test1.isSorted());
	}



}

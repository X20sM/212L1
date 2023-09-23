import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTester {
	ArrayList<Integer> arr =new ArrayList<Integer>(5);
	ArrayList<String> arr2 =new ArrayList<String>(5);
	ArrayList<String> arr3 =new ArrayList<String>(5);
	ArrayList<String> arr4 =new ArrayList<String>(3);
	
	@Before
	public void setUp() throws Exception {
		
		arr.insert(10);
		arr.insert(5);
		arr.insert(10);
		arr.insert(8);
		
		
		arr2.insert("Ali");
		arr2.insert("Mohammed");
		arr2.insert("Saleh");
		arr2.insert("Ahmed");
		arr2.insert("Ali");
		
		arr4.insert("a");
		arr4.insert("b");
		arr4.insert("c");

	}

	@Test
	public void testIsItRepeated() {
		boolean b = arr.isItRepeated(10);
		assertEquals(true, b);
	}
	
	@Test
	public void testIsItRepeated2() {
		boolean b = arr2.isItRepeated("Ali");
		assertEquals(true, b);
	}
	
	@Test
	public void testIsItRepeated3() {
		boolean b = arr2.isItRepeated("Ahmed");
		assertEquals(false, b);
	}
	
	@Test
	public void testIsItRepeated4() {
		boolean b = arr3.isItRepeated("Ahmed");
		assertEquals(false, b);
	}
	
	@Test
	public void testIsItRepeated5() {
		boolean b = arr4.isItRepeated("c");
		assertEquals(false, b);
	}

}

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Frank Bahar Created Date 04/11/2021.
 * Description: This is our test Class which verify our class runs as expected.
 */
public class TestJUnit {

	@Test
	public void testPageCount() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);
		Assert.assertEquals(2, helper.pageCount()); // should == 2
	}

	@Test
	public void testPageCount1() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 7);
		Assert.assertEquals(1, helper.pageCount()); // should == 1
	}
	
	@Test
	public void testPageCountZeroNullCheckZero() {
		PaginationHelper<Character> helper = new PaginationHelper(null, 0);
		Assert.assertEquals(-1, helper.pageCount()); // should == -1
	}
	
	
	@Test
	public void testPageCountZeroNullCheck() {
		PaginationHelper<Character> helper = new PaginationHelper(null, 4);
		Assert.assertEquals(0, helper.pageCount()); // should == 0
	}
	
	@Test
	public void testPageCountZero() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 0);
		Assert.assertEquals(-1, helper.pageCount()); // should == -1 
	}
	
	@Test
	public void testPageCountNegative() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, -1);
		Assert.assertEquals(-1, helper.pageCount()); // should == -1 
	}
	
	@Test
	public void testItemCount() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);

		Assert.assertEquals(6, helper.itemCount()); // should == 6
	}

	@Test
	public void testItemCountNullcheck() {
		PaginationHelper<Character> helper = new PaginationHelper(null, 4);
		Assert.assertEquals(0, helper.itemCount()); // should == 0
	}


	@Test
	public void testItemCountEmpty() {
		ArrayList<Character> arr = new ArrayList<>();
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);
		Assert.assertEquals(0, helper.itemCount()); // should == 0
	}

	@Test
	public void testPageItemCount0() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);
		Assert.assertEquals(4, helper.pageItemCount(0)); // should == 4
	}

	@Test
	public void testPageItemCount00() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 7);
		Assert.assertEquals(6, helper.pageItemCount(0)); // should == 6
	}

	@Test
	public void testPageItemCount01() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 7);
		Assert.assertEquals(-1, helper.pageItemCount(1)); // should == -1
	}
	
	@Test
	public void testPageItemCountNull() {
		PaginationHelper<Character> helper = new PaginationHelper(null, 4);
		Assert.assertEquals(-1, helper.pageItemCount(0)); // should == -1
	}
	
	@Test
	public void testPageItemCountEmpty() {
		PaginationHelper<Character> helper = new PaginationHelper(null, 4);
		Assert.assertEquals(-1, helper.pageItemCount(0)); // should == -1
	}
	
	@Test
	public void testPageItemCount1() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);

		Assert.assertEquals(2, helper.pageItemCount(1)); // should == 2
	}

	@Test
	public void testPageItemCount2() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);

		Assert.assertEquals(-1, helper.pageItemCount(2)); // should == -1
	}

	// pageIndex takes an item index and returns the page that it belongs on
	@Test
	public void testPageIndex5() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);

		Assert.assertEquals(1, helper.pageIndex(5)); // should == 1 (zero based index)
	}

	@Test
	public void testPageIndex2() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);

		Assert.assertEquals(0, helper.pageIndex(2)); // should == 0
	}

	@Test
	public void testPageIndex20() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);

		Assert.assertEquals(-1, helper.pageIndex(20)); // should == -1
	}

	@Test
	public void testPageIndex_10() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);

		Assert.assertEquals(-1, helper.pageIndex(-10)); // should == -1
	}
	
	@Test
	public void testPageIndex0() {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('b');
		arr.add('c');
		arr.add('d');
		arr.add('e');
		arr.add('f');
		PaginationHelper<Character> helper = new PaginationHelper(arr, 7);

		Assert.assertEquals(0, helper.pageIndex(5)); // should == 0
	}
	
	@Test
	public void testPageIndexNull() {
		PaginationHelper<Character> helper = new PaginationHelper(null, 4);

		Assert.assertEquals(-1, helper.pageIndex(3)); // should == -1
	}
	
	@Test
	public void testPageIndexEmpty() {
		ArrayList<Character> arr = new ArrayList<>();
		PaginationHelper<Character> helper = new PaginationHelper(arr, 4);

		Assert.assertEquals(-1, helper.pageIndex(3)); // should == -1
	}
}

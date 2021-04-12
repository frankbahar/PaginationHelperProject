
import java.util.List;

/**
 * Created by Frank Bahar Created Date 04/11/2021.
 * Description: This Class help  to  
 **/
public class PaginationHelper<I> {
	/** 
	 *  Total element count 
	 */
	private int totalCount = 0;
	/**
	 *  Items count per page 
	 */
	private int itemsPerPage = 0;

	/**
	 * The constructor takes in an array of items and a integer indicating how many
	 * items fit within a single page
	 */
	public PaginationHelper(List<I> collection, int itemsPerPage) {
		this.totalCount = collection.size();
		this.itemsPerPage = itemsPerPage;
	}

	/**
	 * returns the number of items within the entire collection
	 */
	public int itemCount() {
		return totalCount;
	}

	/**
	 * returns the number of pages
	 */
	public int pageCount() {
		int totalPages = (int) Math.ceil((float) totalCount / itemsPerPage);
		return totalPages;
	}

	/**
	 * returns the number of items on the current page. page_index is zero based.
	 * this method should return -1 for pageIndex values that are out of range
	 */
	public int pageItemCount(int pageIndex) {
		int c = pageCount();
		if (pageIndex < 0 || pageIndex >= c)
			return -1;
		if (pageIndex == c - 1)
			return totalCount % itemsPerPage;
		else
			return itemsPerPage;
	}

	/**
	 * determines what page an item is on. Zero based indexes this method should
	 * return -1 for itemIndex values that are out of range
	 */
	public int pageIndex(int itemIndex) {
		if (itemIndex < 0 || itemIndex >= totalCount)
			return -1;
		return (itemIndex - 1) / itemsPerPage;
	}
}
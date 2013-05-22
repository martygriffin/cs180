package edu.ucr.c3.wms.utils;

/**
 * ResultChunk
 * 
 * @author ryanrich
 */
public class DataChunk implements PageableChunk {

	/**
	 * 
	 */
	public DataChunk(int offset, int maxSize) {
		this.offset = offset;
		this.maxSize = maxSize;
	}
	
	public DataChunk(int offset, int maxSize, String sortItem) {
		this(offset, maxSize);
		this.sortItem = sortItem;
	}
	
	public DataChunk(int offset, int maxSize, String sortItem, int sortDir) {
		this(offset, maxSize, sortItem);
		switch (sortDir) {
			case PageableChunk.SORT_DIR_DESC:
				this.sortDir = sortDir;
				break;
			case PageableChunk.SORT_DIR_ASC:
			default:
				this.sortDir = PageableChunk.SORT_DIR_ASC;
				break;
		}
	}
	
	public DataChunk(String sortItem, int sortDir) {
		this(0,0,sortItem);
		switch (sortDir) {
			case PageableChunk.SORT_DIR_DESC:
				this.sortDir = sortDir;
				break;
			case PageableChunk.SORT_DIR_ASC:
			default:
				this.sortDir = PageableChunk.SORT_DIR_ASC;
				break;
		}
	}

	/* (non-Javadoc)
	 * @see edu.ucr.c3.util.DataChunk#getOffset()
	 */
	public int getOffset() {
		return offset;
	}

	/* (non-Javadoc)
	 * @see edu.ucr.c3.util.DataChunk#getMaxSize()
	 */
	public int getMaxSize() {
		return maxSize;
	}

	/* (non-Javadoc)
	 * @see edu.ucr.c3.util.DataChunk#getSortDirection()
	 */
	public int getSortDirection() {
		return sortDir;
	}

	/* (non-Javadoc)
	 * @see edu.ucr.c3.util.DataChunk#getSortItem()
	 */
	public String getSortItem() {
		return sortItem;
	}

	private int offset = 0;
	private int maxSize = 10;
	private int sortDir = PageableChunk.SORT_DIR_ASC;
	private String sortItem;
}

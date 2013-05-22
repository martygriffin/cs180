package edu.ucr.c3.wms.utils;


/**
 * DataChunk
 * 
 * Interface for defining datachunks that we request from a data source, 
 * useful for paging items among other things.
 * 
 * @author ryanrich
 */
public interface PageableChunk {

	public static final int SORT_DIR_ASC = 1;
	public static final int SORT_DIR_DESC = 2;
	
	/**
	 * Returns the offset where the datachunk should start at
	 * @return
	 */
	public int getOffset();
	
	/**
	 * Returns the maximum number of records the chunk should contain
	 * @return
	 */
	public int getMaxSize();
	
	/**
	 * The direction the chunk should be sorted in
	 * @return
	 */
	public int getSortDirection();
	
	/**
	 * The item that the chunk should be sorted by.
	 * @return
	 */
	public String getSortItem();
}

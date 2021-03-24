import java.util.ArrayList;

/**
 * SharedData contains the data shared with both threads in ThreadCheckArray
 * @author Aviv Okun & David Nashash
 *
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * Constructor for SharedData class
	 * @param array
	 * Array list of Integers
	 * @param b
	 * Holds the required sum of numbers in ArrayList array
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * Returns boolean array in which the numbers are flagged correspondingly to ArrayList array
	 * @return winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Updates WinArray to the new WinArray
	 * @param winArray
	 * boolean array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Returns ArrayList in which integer numbers are stored
	 * @return array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * Returns the required sum of numbers in the ArrayList
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Returns the current flag
	 * @return flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Sets the flag to the new flag
	 * @param flag
	 * Boolean flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}

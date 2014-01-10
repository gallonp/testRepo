/**
 * @author zhangjialiang
 *
 * @param <T>
 */
public interface Bag<T> {

	/**
	 * @return
	 */
	int getCurrentSize();

	/**
	 * @return
	 */
	boolean isFull();

	/**
	 * @return
	 */
	boolean isEmpty();

	/**
	 * @param newEntry
	 * @return
	 */
	boolean add(T newEntry);

	T remove();

	boolean remove(T anEntry);

	void clear();

	int getFrequencyOf(T anEntry);

	boolean contains(T anEntry);

	T[] toArray();
	
	@SuppressWarnings("rawtypes")
	Bag union(Bag anotherBag);
	
	
	

}

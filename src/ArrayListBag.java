import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListBag<T> implements BagInterface<T> {
	List<T> bag = new ArrayList<T>();
	@Override
	public int getCurrentSize() {
		return bag.size();
	}

	@Override
	public boolean isEmpty() {
		return bag.isEmpty();
	}

	@Override
	public boolean add(T newEntry) {
		bag.add(newEntry);
		return true;
	}

	@Override
	public T remove() {
		// if empty???
		if (!this.isEmpty()){
			double inn  =Math.random()*bag.size();
			int idx = (int) Math.floor(inn);
			return bag.remove(idx);
		} else {
			return null;
		}
	}

	@Override
	public boolean remove(T anEntry) {
		return bag.remove(anEntry);
	}

	@Override
	public void clear() {
		bag.clear();
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		Iterator<T> bagIterator = bag.iterator();
		int frequency = 0;
		while (bagIterator.hasNext()){
			T next = bagIterator.next();
			if (next.equals(anEntry)){
				frequency++;
			}
		}
		return frequency;
	}

	@Override
	public boolean contains(T anEntry) {
		return 	bag.contains(anEntry);
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		T[] obj = (T[])new Object[0];
		return bag.toArray(obj);
	}


}

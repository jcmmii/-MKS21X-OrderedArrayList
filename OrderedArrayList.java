public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("Can't set null");
    }
    super.add(value);
    for (int x = size()-1; x > 0; x--) {
      if (get(x).compareTo(get(x-1)) < 0) {
        T temp = get(x);
        super.set(x, get(x-1));
        super.set(x - 1, temp);
      }
    }
    return true;
  }

  public void add(int index, T value) {
    add(value);
    //ignores index, because this is an ordered array list
  }

  public T set(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Can't set null");
    }
    T replaced = get(index);
    remove(index);
    add(value);
    //stores & returns original value at index, removes that index value,
    //adds new value and orders it
    return replaced;
  }
}

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    super.add(element);
    return true;
  }

  public void add(int index, T element) {
    super.add(element);
    this.sort();
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Can't set null");
    } else {
      T value = get(index);
      this.remove(get(index));
      this.add(element);
      return value;
    }
  }

  public T findLowest() {
    T lowest = this.get(0);
    for (int z = 0; z < this.size(); z++) {
        if (this.get(z).compareTo(lowest) < 0) {
          lowest = this.get(z);
        }
    }
    return lowest;
  }

  public NoNullArrayList sort() {
    NoNullArrayList<T> temp = new NoNullArrayList<T>();
    int len = this.size();
      for (int x = 1; x <= len; x++) {
          T lowest = this.findLowest();
          temp.add(lowest);
          this.remove(lowest);
          len = len-1;
          x = x -1;
        }
    return temp;
    }

  public static void main(String[] args) {
    OrderedArrayList<Integer> A = new OrderedArrayList<Integer>();
    A.add(5);
    A.add(2);
    A.add(20);
    A.add(-4);
    A.add(-19);
    A.add(7);
    A.add(13);
    A.add(23);
    System.out.println(A);
    System.out.println(A.findLowest());
    System.out.println(A.sort());

    OrderedArrayList<String> B = new OrderedArrayList<String>();
    B.add("fuck");
    B.add("This");
    B.add("shit");
    System.out.println(B);
    System.out.println(B.findLowest());
    System.out.println(B.sort());


    A.set(0,2);
    System.out.println(A);
  }
}

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    super.add(element);
    for (int x = size()-1; x > 0; x--) {
      if (get(x).compareTo(get(x-1)) < 0) {
        T temp = get(x);
        super.set(x, get(x-1));
        super.set(x - 1, temp);
      }
    }
    return true;
  }

  public void add(int index, T element) {
    add(element);
    //ignores index, because this is an ordered array list
  }


  public static void main(String[] args) {
    OrderedArrayList<Integer> A = new OrderedArrayList<Integer>();
    A.add(9);
    A.add(8);
    A.add(4);
    A.add(7);
    A.add(6);
    A.add(2);
    System.out.println(A);
  }


/*

















//can be done by super.add(element), then this.sort()
//but this is for the sake of finding the correct index
//to insert the value at
//compares to next val and sees if greater, if it is, adds right there
/*  public void add(int index, T element) {
    this.sort();
    int actualindex = 0;
    for (int x = 0; x < this.size(); x++) {
      if (this.get(x).compareTo(element) >= 0) {
        break;
      }
      actualindex++;
    }
    super.add(actualindex,element);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Can't set null");
    } else {
      T value = this.get(index);
      this.remove(get(index));
      this.add(element);
      return value;
    }
  }

//helper method
  public T findLowest() {
    T lowest = this.get(0);
    for (int z = 0; z < this.size(); z++) {
        if (this.get(z).compareTo(lowest) < 0) {
          lowest = this.get(z);
        }
    }
    return lowest;
  }

//non-built in sort method:
  public void sort() {
    NoNullArrayList<T> temp = new NoNullArrayList<T>();
    int len = this.size();
    for (int x = 1; x <= len; x++) {
        T lowest = this.findLowest();
        temp.add(lowest);
        this.remove(lowest);
        len = len-1;
        x = x -1;
      }
    OrderedArrayList<T> this = new OrderedArrayList<T>(temp);
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
    A.sort();
    System.out.println(A);

    OrderedArrayList<String> B = new OrderedArrayList<String>();
    B.add("");
    B.add("");
    B.add("");
    System.out.println(B);


  //  A.set(0,2);
    System.out.println(A);
  }
}


//find a way to carry to A from temp;

*/
}

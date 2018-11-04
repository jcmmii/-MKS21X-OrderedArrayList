import java.util.ArrayList;
import java.util.List;

public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList() {
      super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Can't add null");
    } else {
      super.add(index, element);
    }
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Can't add null");
    } else {
      super.add(element);
      return true;
    }
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Can't set null");
    } else {
      super.set(index,element);
    }
    return element;
  }
}

public class OALDriver {
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
    B.add("");
    B.add("");
    B.add("");
    System.out.println(B);
    System.out.println(B.findLowest());
    System.out.println(B.sort());


    A.set(0,2);
    System.out.println(A);
  }
}

public class OALDriver {
  public static void main(String[] args) {
    NoNullArrayList<Integer> A = new NoNullArrayList<Integer>();
      System.out.println("\nThis is NoNullArrayList A: " + A);
      try {
        System.out.println("Trying to add null...");
        A.add(null);
      } catch (IllegalArgumentException e){
        System.out.println("Caught catching null - you can't do that");
      }
      System.out.println("Adding 2,6,-10 to A");
      A.add(2);
      A.add(6);
      A.add(-10);
      System.out.println("A is " + A);
      System.out.println("Setting index 1 to 3");
      A.set(1,3);
      System.out.println("A is " + A);
      System.out.println("Adding 7 to index 1");
      A.add(1,7);
      System.out.println("A is " + A);

    System.out.println("\n--------\n");

    OrderedArrayList<Integer> B = new OrderedArrayList<Integer>();
      System.out.println("This is OrderedArrayList B: " + B);
      System.out.println("Adding 5,7,-9,3,-2 to B");
      B.add(5);
      B.add(7);
      B.add(3);
      B.add(-2);
      B.add(-9);
      System.out.println("B is " + B);
      System.out.println("Trying to add 77 at index 2");
      B.add(2,77);
      System.out.println("B is " + B);
      //automatically reorders it, can't add 77 at index 2
      //since values behind it are smaller
      try {
        System.out.println("Trying to add null...");
        B.add(null);
      } catch (IllegalArgumentException e){
        System.out.println("Caught catching null - you can't do that");
      }
      System.out.println("Set index 3 to 100 - removes 5, adds 100");
      B.set(3,100);
      System.out.println("B is " + B);

    System.out.println("\n--------\n");

    OrderedArrayList<String> C = new OrderedArrayList<String>();
      System.out.println("This is OrderedArrayListC: " + C);
      System.out.println("Adding strings hey, WHATS, UP, dude! to C");
      C.add("hey");
      C.add("WHATS");
      C.add("UP");
      C.add("dude!");
      System.out.println("C is " + C);
  }
}

import java.util.Scanner;

public class TestBTree {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     BTree<Integer> t = LibBTree.readIntTree(in);
     System.out.println("numberNodes = " + t.numberNodes());
     System.out.println("depth = " + t.depth());
     System.out.println("ED =(5) " + t.path("ED"));
   }
}

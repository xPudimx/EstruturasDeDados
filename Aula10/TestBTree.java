import java.util.Scanner;

public class TestBTree {
   public static void main(String[] args) {
      // Ler árvore de inteiros em preorder
      Scanner in = new Scanner(System.in);
      BTree<Integer> t = LibBTree.readIntTree(in);

      // Escrever resultado de chamada a alguns métodos
      System.out.println("numberNodes = " + t.numberNodes());
      System.out.println("depth = " + t.depth());
      System.out.println("contains(2) = " + t.contains(2));
      System.out.println("contains(3) = " + t.contains(3));

      // Escrever nós da árvore seguindo várias ordens possíveis
      t.printPreOrder();
      t.printInOrder();
      t.printPostOrder();
      t.printBFS();
      t.printDFS();
   }
}

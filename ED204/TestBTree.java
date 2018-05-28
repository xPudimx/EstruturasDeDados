// -----------------------------------------------------------
// Estruturas de Dados 2017/2018 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1718/
// -----------------------------------------------------------
// Exemplo de utilização da uma árvore binária
// Última alteração: 26/04/2018
// -----------------------------------------------------------

import java.util.Scanner;

public class TestBTree {
   public static void main(String[] args) {
      // Ler árvore de inteiros em preorder
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.nextLine();
      for (int i = 0; i < n; i++) {
         BTree<Integer> t = LibBTree.readIntTree(in);
         System.out.println("Numero de folhas = " + t.numberLeafs());
      }
   }
/*   public static void main(String[] args) {
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
   }*/
}

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
      Scanner in = new Scanner(System.in);

      // Ler árvore de inteiros em preorder
      BTree<Integer> t = LibBTree.readIntTree(in);

      int n = in.nextInt();
      for (int i=0; i<n; i++) {
         String teste = in.next();
         System.out.println("t.path(" + teste + ") = " + t.path(teste));
      }
   }
}

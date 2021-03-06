// -----------------------------------------------------------
// Estruturas de Dados 2017/2018 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1718/
// -----------------------------------------------------------
// Exemplo de utilização da uma árvore binária de pesquisa
// Última alteração: 02/05/2018
// -----------------------------------------------------------

class TestBSTree {
   public static void main(String[] args) {

      // Criação da Árvore
      BSTree<Integer> t = new BSTree<Integer>();

      // Inserindo 11 elementos na árvore binária de pesquisa
      int[] data = {14, 4, 18, 3, 9, 16, 20, 7, 15, 17, 5};
      for (int i=0; i<data.length; i++) t.insert(data[i]);

      // Escrever resultado de chamada a alguns métodos
      System.out.println("numberLeafs = " + t.numberLeafs());
   }
}

// -----------------------------------------------------------
// Estruturas de Dados 2017/2018 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1718/
// -----------------------------------------------------------
// Exemplo de utilização da lista duplamente ligada
// Última alteração: 03/04/2018
// -----------------------------------------------------------

public class TestDoublyLinkedList {
   public static void main(String[] args) {

      // Criação de lista de inteiros
      DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

      // Escrevendo lista (no início está vazia)
      System.out.println(list);

      // Verificando se está vazia
      System.out.println("isEmpty? " + list.isEmpty());     
      
      // Adicionando números de 1 a 5 ao final da lista
      for (int i=1; i<=5; i++)
         list.addLast(i);
      System.out.println(list);

      // Adicionando números de 6 a 10 ao início da lista
      for (int i=6; i<=10; i++)
         list.addFirst(i);
      System.out.println(list);

      // Verificando o tamanho da lista
      System.out.println("size = " + list.size());

      // Retirando o primeiro elemento
      list.removeFirst();
      System.out.println(list);

      // Retirando o último elemento
      list.removeLast();
      System.out.println(list);

      // Verificando se está vazia
      System.out.println("isEmpty? " + list.isEmpty());

      // Escreve o primeiro e último elementos
      System.out.println("getFirst() = " + list.getFirst());
      System.out.println("getLast() = " + list.getLast());

   }
}

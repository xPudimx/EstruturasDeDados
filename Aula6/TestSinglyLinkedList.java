public class TestSinglyLinkedList {
   public static void main(String[] args) {

      // Criação de lista de inteiros
      SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
      SinglyLinkedList<Character> vogais = new SinglyLinkedList<Character>();
      vogais.addLast('a');
      vogais.addLast('e');
      vogais.addLast('i');
      vogais.addLast('o');
      vogais.addLast('u');
      System.out.println(vogais);


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

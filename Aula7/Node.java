// -----------------------------------------------------------
// Estruturas de Dados 2017/2018 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1718/
// -----------------------------------------------------------
// Classe com um nó genérico
// Última alteração: 03/04/2018
// -----------------------------------------------------------

public class Node<T> {
   private T value;      // Valor guardado no nó
   private Node<T> next; // Referência para o próximo nó da lista

   // Construtor
   Node(T v, Node<T> n) {
      value = v;
      next = n;
   }

   // Getters e Setters
   public T getValue() { return value; }
   public Node<T> getNext()  { return next; }
   public void setValue(T v) { value=v; }
   public void setNext(Node<T> n) { next = n; }
}

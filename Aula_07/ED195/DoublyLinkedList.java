// -----------------------------------------------------------
// Estruturas de Dados 2017/2018 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1718/
// -----------------------------------------------------------
// Lista duplamente ligada
// (implementada com sentinelas - nós "dummy" no início e no fim
//  que facilitam a implementação e evitam casos excepcionais)
// Última alteração: 03/04/2018
// -----------------------------------------------------------

public class DoublyLinkedList<T> {
   private DNode<T> first; // Primeiro nó da lista
   private DNode<T> last;  // Último nó da lista
   private int size;       // Tamanho da lista

   // Construtor (cria lista vazia com dois nós sentinelas)
   DoublyLinkedList() {
      first = new DNode<T>(null, null, null);
      last  = new DNode<T>(null, first, null); // Antes do último vem o primeiro
      first.setNext(last); // A seguir ao primeiro vem o último
      size = 0;
   }

   // Retorna o tamanho da lista
   public int size() {
      return size;
   }

   // Devolve true se a lista estiver vazia ou falso caso contrário
   public boolean isEmpty() {
      return (size == 0);
   }
   
   // Retorna o primeiro valor da lista (ou null se a lista for vazia)
   public T getFirst() {
      if (isEmpty()) return null;
      return first.getNext().getValue();
   }

   // Retorna o último valor da lista (ou null se a lista for vazia)
   public T getLast() {
      if (isEmpty()) return null;
      return last.getPrev().getValue();
   }
   
   // Adiciona v ao início da lista
   public void addFirst(T v) {
      addBetween(v, first, first.getNext());
   }

   // Adiciona v ao final da lista
   public void addLast(T v) {
      addBetween(v, last.getPrev(), last);
   }

   // Adiciona elemento entre dois nós n1 e n2
   private void addBetween(T v, DNode<T> n1, DNode<T> n2) {
      DNode<T> newNode = new DNode<T>(v, n1, n2);
      n1.setNext(newNode);
      n2.setPrev(newNode);
      size++;
   }

   // Remove o primeiro elemento da lista (se for vazia não faz nada)
   void removeFirst() {
      remove(first.getNext());
   }

   // Remove o último elemento da lista (se for vazia não faz nada)
   void removeLast() {
      remove(last.getPrev());            
   }

   // Remove um nó da lista
   private void remove(DNode<T> n) {
      DNode<T> prev = n.getPrev();
      DNode<T> next = n.getNext();
      prev.setNext(next);
      next.setPrev(prev);
      size--;
   }
         
   // Converte a lista para uma String
   public String toString() {
      String str = "{";      
      DNode<T> cur = first.getNext();
      for (int i=0; i<size; i++) {
         str += cur.getValue();
         cur = cur.getNext();
         if (cur != last) str += ",";
      }      
      str += "}";
      return str;
   }
}

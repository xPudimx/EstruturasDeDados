public class SinglyLinkedList<T> {
   private Node<T> first;    // Primeiro nó da lista
   private int size;         // Tamanho da lista

   // Construtor (cria lista vazia)
   SinglyLinkedList() {
      first = null;
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

   // Adiciona v ao início da lista
   public void addFirst(T v) {
      Node<T> newNode = new Node<T>(v, first);
      first = newNode;
      size++;
   }

   // Adiciona v ao final da lista
   public void addLast(T v) {
      Node<T> newNode = new Node<T>(v, null);
      if (isEmpty()) {
         first = newNode;
      } else {
         Node<T> cur = first;
         while (cur.getNext() != null)
            cur = cur.getNext();
         cur.setNext(newNode);
      }
      size++;
   }

   // Retorna o primeiro valor da lista (ou null se a lista for vazia)
   public T getFirst() {
      if (isEmpty()) return null;
      return first.getValue();
   }

   // Retorna o último valor da lista (ou null se a lista for vazia)
   public T getLast() {
      if (isEmpty()) return null;
      Node<T> cur = first;
      while (cur.getNext() != null)
         cur = cur.getNext();
      return cur.getValue();
   }

   // Remove o primeiro elemento da lista (se for vazia não faz nada)
   public void removeFirst() {
      if (isEmpty()) return;
      first = first.getNext();
      size--;
   }

   // Remove o último elemento da lista (se for vazia não faz nada)
   public void removeLast() {
      if (isEmpty()) return;
      if (size == 1) {
         first = null;
      } else {
         // Ciclo com for e uso de de size para mostrar alternativa ao while
         Node<T> cur = first;
         for (int i=0; i<size-2; i++)
            cur = cur.getNext();
         cur.setNext(cur.getNext().getNext());
      }
      size--;
   }

   public T get(int pos) {
     Node<T> cur = first;
     if(size <= pos || pos < 0) return null;
     if(size == 0) return null;
     for(int i = 0; i < pos; i++){
       cur = cur.getNext();
     }
     return cur.getValue();
   }

    public void duplicate() {
      int oldsize = size;
      Node<T> cur = first;
      for (int i=0; i<oldsize; i++) {
        Node<T> dup = new Node<T>(cur.getValue(), cur.getNext());
        cur.setNext(dup);
        cur = cur.getNext().getNext();
        size++;
      }
    }

    public SinglyLinkedList<T> copy() {
      SinglyLinkedList<T> copied = new SinglyLinkedList<T>();
      Node<T> cur = first;
      for(int i=0; i<size; i++){
        copied.addLast(cur.getValue());
        cur = cur.getNext();
      }
      return copied;

    }

    public T remove(int pos){
      Node<T> cur = first;
      if(pos==0){
        T value = getFirst();
        removeFirst();
        return value;
      }
      if(size <= pos || pos < 0) return null;

      for(int i=0;i<pos-1;i++){
        cur = cur.getNext();
      }
      T value = cur.getNext().getValue();
      cur.setNext(cur.getNext().getNext());
      size--;
      return value;
    }

   // Converte a lista para uma String
   public String toString() {
      String str = "{";
      Node<T> cur = first;
      while (cur != null) {
         str += cur.getValue();
         cur = cur.getNext();
         if (cur != null) str += ",";
      }
      str += "}";
      return str;
   }
}

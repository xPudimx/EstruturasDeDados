public class TestCircularLinkedList {
   public static void main(String[] args) {

      // Simulando processos (A,B,C,D) e escalonamento round-robin      
      // Criação de lista de caracteres
      CircularLinkedList<Character> list = new CircularLinkedList<Character>();

      // Adicionando letras de 'A' a 'E'
      list.addLast('A');
      list.addLast('B');
      list.addLast('C');
      list.addLast('D');

      // Mostrando rotação a funcionar
      System.out.println("8 rondas round-robin");
      for (int i=1; i<=8; i++) {
         System.out.println(i + ": " + list);
         list.rotate();
      }

      // Inserir e retirar elemento no final
      list.addLast('E');
      System.out.println("addLast('E'): " + list);
      list.removeLast();
      System.out.println("removeLast(): " + list);

      // Inserir retirar elemento no início
      list.addFirst('F');
      System.out.println("addFirst('F'): " + list);
      list.removeFirst();
      System.out.println("removeFirst(): " + list);

   }
}
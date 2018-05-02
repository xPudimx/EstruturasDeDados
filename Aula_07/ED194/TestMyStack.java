// -----------------------------------------------------------
// Estruturas de Dados 2017/2018 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1718/
// -----------------------------------------------------------
// Exemplo de utilização do TAD Pilha
// Última alteração: 06/04/2018
// -----------------------------------------------------------

public class TestMyStack {
   public static void main(String[] args) {

      // Criação da pilha
      MyStack<Integer> s = new LinkedListStack<Integer>();
      System.out.println("top = " + s.top());
      //MyStack<Integer> s = new ArrayStack<Integer>();

      // Exemplo de inserção de elementos na pilha
      for (int i=1; i<=8; i++)
         s.push(i); // insere i no topo da pilha
      System.out.println(s);

      // Exemplo de remoção de elementos na pilha
      for (int i=0; i<4; i++) {
         int aux = s.pop(); // retira o elemento no topo da pilha
         System.out.println("s.pop() = " + aux);
      }
      System.out.println(s);

      // Exemplo de utilização dos outros métodos
      System.out.println("s.size() = " + s.size());
      System.out.println("s.isEmpty() = " + s.isEmpty());
      System.out.println("s.top() = " + s.top());
   }
}

// -----------------------------------------------------------
// Estruturas de Dados 2017/2018 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1718/
// -----------------------------------------------------------
// Interface para o TAD Pilha
// Última alteração: 06/04/2018
// -----------------------------------------------------------

public interface MyStack<T> {

   // Métodos que modificam a pilha
   public void push(T v); // Coloca um valor no topo da pilha
   public T pop();        // Retira e retorna o valor no topo da pilha

   // Métodos que acedem a informação (sem modificar)
   public T top();           // Retorna valor no topo da pilha
   public int size();        // Retorna quantidade de elementos na pilha
   public boolean isEmpty(); // Indica se a pilha está vazia
}

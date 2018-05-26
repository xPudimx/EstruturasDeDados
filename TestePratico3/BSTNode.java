// -----------------------------------------------------------
// Estruturas de Dados 2017/2018 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1718/
// -----------------------------------------------------------
// Nó de uma árvore binária de pesquisa
// Última alteração: 13/05/2018
// -----------------------------------------------------------

// O tipo T tem de implementar o interface Comparable
// (ou tê-lo herdado de uma super classe).
public class BSTNode<T extends Comparable<? super T>> {
   private T value;          // Valor guardado no nó
   private BSTNode<T> left;  // Filho esquerdo
   private BSTNode<T> right; // Filho direito

   // Construtor
   BSTNode(T v, BSTNode<T> l, BSTNode<T> r) {
      value = v;
      left = l;
      right = r;
   }

   // Getters e Setters
   public T getValue() {return value;}
   public BSTNode<T> getLeft() {return left;}
   public BSTNode<T> getRight() {return right;}
   public void setValue(T v) {value = v;}
   public void setLeft(BSTNode<T> l) {left = l;}
   public void setRight(BSTNode<T> r) {right = r;}   
}

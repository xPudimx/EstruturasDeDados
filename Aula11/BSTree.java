public class BSTree<T extends Comparable<? super T>> {
   private BSTNode<T> root; // raíz da árvore

   // Construtor
   BSTree() {
      root = null;
   }

   // Getter e Setter para a raíz
   public BSTNode<T> getRoot() {return root;}
   public void setRoot(BSTNode<T> r) {root = r;}

   // Verificar se árvore está vazia
   public boolean isEmpty() {
      return root == null;
   }

   // Limpa a árvore (torna-a vazia)
   public void clear() {
      root = null;
   }

   public T minValue(){
     BSTNode cur = root;
     while(cur.getLeft() != null){
       cur.getLeft();
     }
     return cur.getValue();
   }

   // --------------------------------------------------------
   // Número de nós da árvore
   public int numberNodes() {
      return numberNodes(root);
   }

   private int numberNodes(BSTNode<T> n) {
      if (n == null) return 0;
      return 1 + numberNodes(n.getLeft()) + numberNodes(n.getRight());
   }

   // --------------------------------------------------------
   // O elemento value está contido na árvore?
   public boolean contains(T value) {
      return contains(root, value);
   }

   private boolean contains(BSTNode<T> n, T value) {
      if (n==null) return false;
      if (value.compareTo(n.getValue()) < 0) // menor? sub-árvore esquerda
         return contains(n.getLeft(), value);
      if (value.compareTo(n.getValue()) > 0) // maior? sub-arvore direita
         return contains(n.getRight(), value);
      return true; // se não é menor ou maior, é porque é igual
   }

   // --------------------------------------------------------
   // Adicionar elemento a uma árvore de pesquisa
   // Devolve true se conseguiu inserir, false caso contrário
   public boolean insert(T value) {
      if (contains(value)) return false;
      root = insert(root, value);
      return true;
   }

   private BSTNode<T> insert(BSTNode<T> n, T value) {
      if (n==null)
         return new BSTNode<T>(value, null, null);
      else if (value.compareTo(n.getValue()) < 0)
         n.setLeft(insert(n.getLeft(), value));
      else if (value.compareTo(n.getValue()) > 0)
         n.setRight(insert(n.getRight(), value));
      return n;
   }

   // --------------------------------------------------------
   // Remover elemento de uma árvore de pesquisa
   // Devolve true se conseguiu remover, false caso contrário
   public boolean remove(T value) {
      if (!contains(value)) return false;
      root = remove(root, value);
      return true;
   }

   // Assume-se que elemento existe (foi verificado antes)
   private BSTNode<T> remove(BSTNode<T> n, T value) {
      if (value.compareTo(n.getValue()) < 0)
         n.setLeft(remove(n.getLeft(), value));
      else if (value.compareTo(n.getValue()) > 0)
         n.setRight(remove(n.getRight(), value));
      else if (n.getLeft() == null) // Não tem filho esquerdo
         n = n.getRight();
      else if (n.getRight() == null) // Não tem filho direito
         n = n.getLeft();
      else { // Dois fihos: ir buscar máximo do lado esquerdo
         BSTNode<T> max = n.getLeft();
         while (max.getRight() != null) max = max.getRight();
         n.setValue(max.getValue()); // Substituir valor removido
         // Apagar valor que foi para lugar do removido
         n.setLeft(remove(n.getLeft(), max.getValue()));
      }
      return n;
   }

   // --------------------------------------------------------
   // Altura da árvore
   public int depth() {
      return depth(root);
   }

   private int depth(BSTNode<T> n) {
      if (n == null) return -1;
      return 1 + Math.max(depth(n.getLeft()), depth(n.getRight()));
   }

   // --------------------------------------------------------

   // Imprimir árvore em PreOrder
   public void printPreOrder() {
      System.out.print("PreOrder:");
      printPreOrder(root);
      System.out.println();
   }

   private void printPreOrder(BSTNode<T> n) {
      if (n==null) return;
      System.out.print(" " + n.getValue() );
      printPreOrder(n.getLeft());
      printPreOrder(n.getRight());
   }

   // --------------------------------------------------------

   // Imprimir árvore em InOrder
   public void printInOrder() {
      System.out.print("InOrder:");
      printInOrder(root);
      System.out.println();
   }

   private void printInOrder(BSTNode<T> n) {
      if (n==null) return;
      printInOrder(n.getLeft());
      System.out.print(" " + n.getValue());
      printInOrder(n.getRight());
   }

   // --------------------------------------------------------

   // Imprimir árvore em PostOrder
   public void printPostOrder() {
      System.out.print("PostOrder:");
      printPostOrder(root);
      System.out.println();
   }

   private void printPostOrder(BSTNode<T> n) {
      if (n==null) return;
      printPostOrder(n.getLeft());
      printPostOrder(n.getRight());
      System.out.print(" " + n.getValue());
   }

   // --------------------------------------------------------

   // Imprimir árvore numa visita em largura (usando TAD Fila)
   public void printBFS() {
      System.out.print("BFS:");

      MyQueue<BSTNode<T>> q = new LinkedListQueue<BSTNode<T>>();
      q.enqueue(root);
      while (!q.isEmpty()) {
         BSTNode<T> cur = q.dequeue();
         if (cur != null) {
            System.out.print(" " + cur.getValue());
            q.enqueue(cur.getLeft());
            q.enqueue(cur.getRight());
         }
      }
      System.out.println();
   }

   // --------------------------------------------------------

   // Imprimir árvore numa visita em largura (usando TAD Pilha)
   public void printDFS() {
      System.out.print("DFS:");

      MyStack<BSTNode<T>> q = new LinkedListStack<BSTNode<T>>();
      q.push(root);
      while (!q.isEmpty()) {
         BSTNode<T> cur = q.pop();
         if (cur != null) {
            System.out.print(" " + cur.getValue());
            q.push(cur.getLeft());
            q.push(cur.getRight());
         }
      }
      System.out.println();
   }

}

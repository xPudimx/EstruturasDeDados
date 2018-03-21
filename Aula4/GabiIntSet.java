import java.util.Arrays;

// Implementa o TAD conjunto usando um array como lista de elementos
public class MyIntSet {
   private int size;   // Numero de elementos do conjunto
   private int elem[]; // Array que contém os elementos em si 

   // Construtor (argumento é o tamanho máximo do conjunto)
   MyIntSet(int maxSize) {
      elem = new int[maxSize];
      size = 0;
   }

   // Adiciona um elemento x ao conjunto, caso ele ainda não exista no
   // conjunto. Devolve true caso consiga adicionar, e falso caso contrário.
   public boolean add(int x) {
      if (!contains(x)) {
         if (size == elem.length)
            throw new RuntimeException("Maximum size of set reached");         
         elem[size] =  x;
         size++;
         return true;
      }
      return false;
   }

   // Remove um elemento x do conjunto. Devolve true se x estava
   // no conjunto, ou false caso contrário
   public boolean remove(int x) {
      if (contains(x)) {
         int pos = 0;
         while (elem[pos] != x) pos++;
         size--;
         elem[pos] = elem[size]; // Trocar último elemento 
         return true;            // com o que se removeu
      }
      return false;
   }
   
   // Verifica se um elemento x está no conjunto
   public boolean contains(int x) {
      for (int i=0; i<size; i++)
         if (elem[i] == x)
            return true;
      return false;
   }

   // Limpa o conjunto (torna-o vazio)
   public void clear() {
      size = 0;
   }

   // Retorna o tamanho de um conjunto
   public int size() {
      return size;
   }

   //Devolve os elementos do array como array mas com o size correto
   public int[] getElems() {
      int[] arrElems = Arrays.copyOfRange(elem, 0, size);
      return arrElems;
   }

   //Devolve a uniao de dois sets
   public MyIntSet union(MyIntSet obj2) {
      int[] arr_obj2 = obj2.getElems();

      MyIntSet finalSet = new MyIntSet(100);
      for (int i=0; i<this.size; i++) {
         finalSet.add(this.elem[i]);
      }
      for (int i=0; i<arr_obj2.length; i++) {
         finalSet.add(arr_obj2[i]);
      }

      return finalSet;
   }

   // Converte o conjunto para String
   public String toString() {
      String res = "{";
      for (int i=0; i<size; i++) {
         if (i>0) res += ",";
         res += elem[i];
      }
      res += "}";
      return res;
   }
}
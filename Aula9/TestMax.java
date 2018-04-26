public class TestMax {

   // Os 3 métodos seguintes recebem array v[] e duas posições start e end
   // e devolvem o maior número do array entre start e end (inclusive)

   // --------------------------------------------------------

   // Versão iterativa
   static int maxIt(int v[], int start, int end) {
      int maxSoFar = v[start];                // Maior até agora
      for (int i=start+1; i<=end; i++)        // Percorrer intervalo
         maxSoFar = Math.max(maxSoFar, v[i]); // Actualizar máximo
      return maxSoFar;
   }

   // --------------------------------------------------------

   // Versão recursiva 1: dividir em elemento inicial e resto da lista
   static int maxRec1(int v[], int start, int end) {
      if (start == end) return v[start];  // caso base (tamanho 1)
      int max = maxRec1(v, start+1, end); // chamada recursiva (resto da lista)
      return Math.max(v[start], max);     // combinar resultado
   }

   // --------------------------------------------------------

   // Versão recursiva 2: dividir em metade esquerda e metade direita
   static int maxRec2(int v[], int start, int end) {
      if (start == end) return v[start];    // caso base (tamanho 1)
      int middle = (start + end) / 2;       // ponto médio
      int max1 = maxRec2(v, start, middle); // recursão na metade esquerda
      int max2 = maxRec2(v, middle+1, end); // recursão na metade direita
      return Math.max(max1, max2);          // combinar resultado
   }

   // --------------------------------------------------------

   public static void main(String[] args) {
      int v[] = {1,5,2,8,4,3,7,6}; // Inicialização de array

      System.out.println("maxIt: " + maxIt(v, 0, v.length-1));
      System.out.println("maxRec1: " + maxRec1(v, 0, v.length-1));
      System.out.println("maxRec2: " + maxRec2(v, 0, v.length-1));
   }

}

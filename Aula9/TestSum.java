public class TestSum {
   // Versão iterativa
   static int sumIt(int v[], int start, int end) {
      int sumSoFar = v[start];                // Maior até agora
      for (int i=start+1; i<=end; i++)        // Percorrer intervalo
         sumSoFar = Math.addExact(sumSoFar, v[i]); // Actualizar máximo
      return sumSoFar;
   }

   // --------------------------------------------------------

   // Versão recursiva 1: dividir em elemento inicial e resto da lista
   static int sumRec1(int v[], int start, int end) {
      if (start == end) return v[start];  // caso base (tamanho 1)
      int sum = sumRec1(v, start+1, end); // chamada recursiva (resto da lista)
      return Math.addExact(v[start], sum);     // combinar resultado
   }

   // --------------------------------------------------------

   // Versão recursiva 2: dividir em metade esquerda e metade direita
   static int sumRec2(int v[], int start, int end) {
      if (start == end) return v[start];    // caso base (tamanho 1)
      int middle = (start + end) / 2;       // ponto médio
      int sum1 = sumRec2(v, start, middle); // recursão na metade esquerda
      int sum2 = sumRec2(v, middle+1, end); // recursão na metade direita
      return Math.addExact(sum1, sum2);          // combinar resultado
   }

   // --------------------------------------------------------

   public static void main(String[] args) {
      int v[] = {1,5,2,8,4,3,7,6}; // Inicialização de array

      System.out.println("SumIt: " + sumIt(v, 0, v.length-1));
      System.out.println("sumRec1: " + sumRec1(v, 0, v.length-1));
      System.out.println("sumRec2: " + sumRec2(v, 0, v.length-1));
   }

}

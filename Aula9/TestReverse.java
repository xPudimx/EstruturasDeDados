import java.util.Arrays;

public class TestReverse {

   // Inverter array v entre posicões start e end
   static void reverse(int v[], int start, int end) {
      if (start>=end) return;     // Caso base: array de tamanho < 2
      int tmp = v[start];         // Trocar primeiro com último
      v[start] = v[end];
      v[end] = tmp;
      reverse(v, start+1, end-1); // Chamada recursiva para o resto
   }

   // -----------------------------------------------------------

   public static void main(String[] args) {
      int v[] = {2,4,6,8,10}; // Inicialização de array

      System.out.println("Antes  do reverse: " + Arrays.toString(v));
      reverse(v, 0, v.length-1);
      System.out.println("Depois do reverse: " + Arrays.toString(v));
   }
}

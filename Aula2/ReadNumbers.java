import java.util.Scanner;
import java.util.Arrays; 

public class ReadNumbers {

   // Escrever os numeros guardados num array no stdout
   static void writeArray(int v[]) {
      for (int i=0; i<v.length; i++)          
         System.out.println("v[" + i + "] = " + v[i]);      
   }
   
   static int amp (int v[], int n) {
	   Arrays.sort(v);
	   int amp;
	   amp = v[n-1] - v[0];
	   return amp;
   }
   
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      int n = stdin.nextInt();   // Ler a quantidade de numeros que se seguem
      int v[] = new int[n];     // Cria um novo array com espaço para n inteiros           
      
      
      for (int i=0; i<n; i++)    // Ler os numeros a partir do stdin
         v[i] = stdin.nextInt();
      
      writeArray(v);             // Chamar procedimento que escreve
      System.out.printf("Amplitude = %d\n", amp(v,n));
   }
}


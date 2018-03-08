import java.util.Scanner;
import java.util.Arrays;

public class Estatisticas {

   static int amp (int array[], int n) {
	   Arrays.sort(array);
	   int amp;
	   amp = array[n-1] - array[0];
	   return amp;
   }
   
   static float media ( int array[], int n){
	   float soma = 0;
	   float media;
	   for(int i = 0; i < n; i++){
		   soma += array[i];
	   }
	   media=soma/n;
	   return media;
   }
	   
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      int n = stdin.nextInt();   
      int v[] = new int[n];              
      
      
      for (int i=0; i<n; i++)    
         v[i] = stdin.nextInt();
      System.out.printf("%.2f\n", media(v,n));
      System.out.printf("%d\n", amp(v,n));
   }
}


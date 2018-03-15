import java.util.Scanner;

public class Unique {
   public static void main(String[] args) {
	  
	  Scanner stdin = new Scanner(System.in);
	  int n;
      
      IntSet s = new ArrayListIntSet(1000000);
      
      while (stdin.hasNextInt()){
		  n = stdin.nextInt();
		  s.add(n);
	  }
      System.out.println(s.size() + " numeros unicos");
   }
}

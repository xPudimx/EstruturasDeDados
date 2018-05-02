import java.util.Scanner;

public class ED006 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      CircularLinkedList<String> peopleplayingpimpampumexe;
      int voltas = sc.nextInt();
      for (int i=0; i<voltas; i++) {
         sc.nextLine();
         int frase = sc.nextLine().split(" ").length;

         peopleplayingpimpampumexe = new CircularLinkedList<String>();
         int pessoas = sc.nextInt();
         for (int j=0; j<pessoas; j++) {
            peopleplayingpimpampumexe.addLast(sc.next());
         }

         while (peopleplayingpimpampumexe.size()>1) {
            for (int k=0; k<frase-1; k++) {
               peopleplayingpimpampumexe.rotate();
            }
            peopleplayingpimpampumexe.removeFirst();
         }
         if (peopleplayingpimpampumexe.getFirst().equals("Carlos")) {
            System.out.println("O Carlos nao se livrou");
         } else {
            System.out.println("O Carlos livrou-se (coitado do " + peopleplayingpimpampumexe.getFirst() +"!)");
         }
      }
   }
}
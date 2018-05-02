public class ED196 {
   public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b) {
      while (q.first() != null) {
         String Nome = q.dequeue();
         String Fila = q.dequeue();

         switch (Fila) {
            case "A":
                  a.enqueue(Nome);
                  break;

            case "B":
                  b.enqueue(Nome);
                  break;

            default: 
                  if (a.size() < b.size())
                     a.enqueue(Nome);
                  else if (b.size() < a.size())
                     b.enqueue(Nome);
                  break;
         }
      }
   }
}
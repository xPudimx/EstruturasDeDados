public class ED195 {
   public static boolean balanced(String s) {
      MyStack<Character> pilha = new LinkedListStack<Character>();
      char trash;

      if (s.length() % 2 != 0) //pequena verificacao
         return false;
      for (int i=0; i<s.length(); i++) {
         if (s.charAt(i) == ')') {
            if (pilha.top() != '(')
               return false;
            trash = pilha.pop();
         }
         else if (s.charAt(i) == ']') {
            if (pilha.top() != '[')
               return false;
            trash = pilha.pop();
         }
         else
            pilha.push(s.charAt(i));

      }
      if (pilha.top() != null)
         return false;
      return true;
   }
}
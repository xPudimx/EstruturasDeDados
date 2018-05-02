public class ED194 {

  public static void reverse(MyStack<Integer> s, int n){
    if(s.isEmpty()) return;
    if(n==1) return;

    int aux[] = new int[n];

    for(int i=0; i < n; i++){
      aux[i] = s.pop();
    }

    for (int i=0; i<n; i++){
      s.push(aux[i]);
    }
  }
}

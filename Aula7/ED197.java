public class ED197{
  public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
    MyQueue<Integer> c = new LinkedListQueue<Integer>();

    while(a.first() != null && b.first() != null){
      if(a.first() < b.first()){
        c.enqueue(a.dequeue());
      }
      else
        c.enqueue(b.dequeue());
    }
    if(a.first() != null){
      while(a.first() != null)
        c.enqueue(a.dequeue());
    }

    if(b.first() != null){
      while (b.first() != null)
        c.enqueue(b.dequeue());
    }
    return c;
  }
}

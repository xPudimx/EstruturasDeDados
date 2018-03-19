public class MyTestSet {
   public static void main(String[] args) {
                MyIntSet s1 = new MyIntSet(3);
                s1.add(1);
                s1.add(5);
                s1.add(7);
                
                MyIntSet s2 = new MyIntSet(3);
                s2.add(2);
                s2.add(5);
                s2.add(8);

                MyIntSet s3 = s1.union(s2);
                System.out.println(s1+" union with "+s2+" = "+s3+" [size="+s3.size()+"]");
   }
}

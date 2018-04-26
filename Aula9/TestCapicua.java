

public class TestCapicua{

  static boolean capicua(int v[], int start, int end){
    if(start>end) return false;
    if(start==end || start+1==end){
      return true;
    }
    if(v[start] == v[end]){
      capicua(v,start+1,end-1);
    }
    return false;
}

public static void main(String[] args) {

  int ex1[] = {1,2,3,2,1};
  int ex2[] = {5,8,8,5};
  int ex3[] = {1,2,3,1};
  int ex4[] = {5,8,7,5};
  int ex5[] = {1,2,1};
  System.out.println(capicua(ex1, 0, 4));
  System.out.println(capicua(ex2, 0, 3));
  System.out.println(capicua(ex3, 0, 3));
  System.out.println(capicua(ex4, 0, 3));
  System.out.println(capicua(ex5,0,2));

  }
}

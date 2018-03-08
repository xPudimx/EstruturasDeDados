
class Aluno {
	public static int contador = 0;

   String nome;
   int numero;
    public String toString(){
	  return "(" + nome + "," + numero + ")";
  }
   // Construtor "padrão"
   Aluno() {
      nome   = "indefinido";
      numero = -1;
   }
   
   Aluno(String n, int mec) {
	   contador++;
	   nome = n;
	   numero = mec;
	}
	int ano(){
		contador++;
		return numero / 100000;
	}
}

public class TestAluno {
   public static void main(String[] args) {
      Aluno a = new Aluno();
      
      System.out.println("a.nome = " + a.nome);
      System.out.println("a.numero = " + a.numero);
      System.out.println("a = " +a);
      
      Aluno b = new Aluno();
      Aluno c = b;
      b.nome = "modificado";
      System.out.println("b = " + b);
      System.out.println("c = " + c);
      
      Aluno d = new Aluno();
      Aluno e = new Aluno("Manuel", 201506234);
      System.out.println("d =" + d);
      System.out.println("e =" + e);
      
      Aluno g = new Aluno("Ana", 201408762);
      Aluno h = new Aluno("Bruno", 201508145);
      System.out.println(g.ano() + " " + h.ano());
      
      int n=3;
      Aluno[] v = new Aluno[n];
      for (int i=0; i<n; i++){
		  v[i] = new Aluno();
	  }
	  
      for(int i=0; i<n; i++){
		  System.out.println("v[" + i + "] = " + v[i]);
	  }
	  v[0].nome = "Pedro";
	  
	  System.out.println("contador = " + Aluno.contador);

    }
}

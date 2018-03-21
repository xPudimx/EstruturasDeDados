import java.util.Scanner;
public class Geometry {
   public static void main (String[] args){   
      Scanner read = new Scanner(System.in);
      int P = read.nextInt();
      Point[] pontos = new Point[P];
      for (int i=0;i<P;i++){
      	int px = read.nextInt();
      	int py = read.nextInt();

      	pontos[i] = new Point(px, py);

      }

      int R = read.nextInt();
      Rectangle[] ret = new Rectangle[R];
      for (int i=0;i<R;i++){
      	int x1 = read.nextInt();
      	int y1 = read.nextInt();
      	int x2 = read.nextInt();
      	int y2 = read.nextInt();

      	ret[i] = new Rectangle(new Point(x1, y1), new Point(x2, y2));

      }
      read.close(); //Fechar o scanner;

      int r1 = 0; // guardar numero pontos
      int r2 = 0; // guardar numero retangulos

      //comparar pontos com retangulos ,se os pontos nao estiverem contidos no retangulo adicionar a r1 
      for (int i=0; i<P; i++){
      	boolean flag = false;
      	for (int j=0; j<R; j++){
      		if(flag)
      			break;
      		if(ret[j].pointInside(pontos[i]))
      			flag = true;
      	}
      	if(!flag)
      		r1 = r1 + 1;
      }

      //comparar retangulos com pontos, se o retangulo nao contiver nenhum ponto r2++
      for(int i=0; i<R; i++){
      	boolean flag = false;
      	for(int j=0; j<P; j++){
      		if(flag)
      			break;
      		if(ret[i].pointInside(pontos[j]))
      			flag = true;
      	}
      	if(!flag)
      		r2 = r2 + 1;
      }
      System.out.println(r1 + " " + r2);
      System.exit(0);
   }
}



// #---------------------------------#
// |								 |
// | Code Based on Gabriel's Code :) |
// |								 |
// #---------------------------------#
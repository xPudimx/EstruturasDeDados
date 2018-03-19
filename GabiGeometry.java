import java.util.Scanner;

public class Geometry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		Point[] pontos = new Point[P];
		for (int i=0; i<P; i++) {
			int px = sc.nextInt();
			int py = sc.nextInt();
			
			pontos[i] = new Point(px, py);
		}
		
		int L = sc.nextInt();
		Rectangle[] retangulos = new Rectangle[L];
		for (int i=0; i<L; i++) {
			int px1 = sc.nextInt();
			int py1 = sc.nextInt();
			int px2 = sc.nextInt();
			int py2 = sc.nextInt();
			
			retangulos[i] = new Rectangle(new Point(px1, py1), new Point(px2, py2));
		}
		sc.close();
		
		int arg1 = 0; //deve indicar o número de pontos que não estão dentro de nenhum rectângulo
		int arg2 = 0; //deve indicar o número de rectângulos que não contêm nenhum ponto
		
		//para cada retangulo fazer pointInside() de todos os pontos se encontar adicionar a arg1
		for (int i=0; i<P; i++) {
			boolean flag = false;
			for (int j=0; j<L; j++) {
				if (flag)
					break;
				if (retangulos[j].pointInside(pontos[i]))
					flag = true;
			}
			if (!flag)
				arg1 = arg1 + 1;
		}
		
		//para cada retangulo fazer pointInside() de todos os pontos, adicionar se nao encontrar nenhum a arg2
		for (int i=0; i<L; i++) {
			boolean flag = false;
			for (int j=0; j<P; j++) {
				if (flag)
					break;
				if (retangulos[i].pointInside(pontos[j]))
					flag = true;
			}
			if (!flag)
				arg2 = arg2 + 1;
		}
		
		System.out.println(arg1 + " " + arg2);
		System.exit(0);
	}

}

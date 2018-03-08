class Point {
   int x, y;

   Point() {
      x = y = 0;
   }
   
   Point(int x0, int y0) {
      x = x0;
      y = y0;
   }

   // Devolve uma representação em texto do conteúdo de um Ponto
   public String toString() {
      return "(" + x + "," + y + ")";
   }
}
class Rectangle {
	Point p1, p2;
	
	Rectangle() {
		p1 = new Point(0,0);
		p2 = new Point(1,1);
	}
	
	Rectangle(int x1, int y1, int x2, int y2) {
		p1 = new Point(x1,y1);
		p2 = new Point(x2,y2);
	}
	
	Rectangle(Point q1, Point q2) {
		p1 = q1;
		p2 = q2;
	}
	
	int area() {
		int area = (p2.x - p1.x) * (p2.y - p1.y);
		return area;
	}
	
	int perimeter() {
		int per = 2*((p2.x - p1.x) + (p2.y - p1.y));
		return per;
	}
	
	boolean pointInside(Point p) {
		if ( p.x > p1.x && p.x < p2.x && p.y > p1.y && p.y < p2.y){
			return true;
		}
		else return false;
	}
	
	boolean rectangleInside(Rectangle r) {
		if (r.p1.x > p1.x && r.p2.x < p2.x && r.p1.y > p1.y && r.p2.y < p2.y) {
			return true;
		}
		else return false ;
	}
		
		
}
	
public class TestGeometry {
   public static void main (String[] args){
      Point p1 = new Point();
	
      System.out.println("p1 original: " + p1);
      p1.x = 1;
      System.out.println("p1 modificado: " + p1);

      Point p2 = new Point(2,3);
      System.out.println("p2: " + p2);
      Point a = new Point(1,1);
	  Point b = new Point(2,2);
	  Point c = new Point(3,4);
	  Point d = new Point(8,2);

	  Rectangle amarelo  = new Rectangle(a, c);
	  Rectangle laranja  = new Rectangle(2, 3, 9, 6);
	  Rectangle verde    = new Rectangle(3, 4, 4, 5);
	  Rectangle azul     = new Rectangle(5, 1, 6, 5);
	  Rectangle vermelho = new Rectangle(7, 3, 9, 5);

	  System.out.println("Perimetro do retangulo amarelo = " + amarelo.perimeter());
	  System.out.println("Perimetro do retangulo laranja = " + laranja.perimeter());

	  System.out.println("Area do retangulo amarelo = " + amarelo.area());
	  System.out.println("Area do retangulo laranja = " + laranja.area());
	
	  System.out.println("Ponto B dentro rectangulo amarelo? " + amarelo.pointInside(b));
	  System.out.println("Ponto D dentro rectangulo amarelo? " + amarelo.pointInside(d));

	  System.out.println("Retangulo verde dentro do laranja? " + laranja.rectangleInside(verde));
      System.out.println("Retangulo azul dentro do laranja? " + laranja.rectangleInside(azul));
               
   }
}

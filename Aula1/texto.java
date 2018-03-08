EXERCICIO 1!


// Uma classe muito simples que usa um ciclo para imprimir numeros entre 1 e n

// O ficheiro tem de ter o mesmo nome da classe + a extensão '.java'
public class Numbers {
    public static void main(String[] args) {
	int n = 10; // limite dos numeros
	
	System.out.println("Numeros de 1 a " + n + ":"); // + é o operador de concatenação de strings
	for (int i=1; i<=n; i++)
	    System.out.println(i);
    }
}


1)
	a) Deve ter o mesmo nome que a class, se for diferente : 
		Numbers.java:1: error: class numbers is public, should be declared in a file named numbers.java
		public class numbers {
		^
		1 error
		
	b) Numbers.class
	
	c) Numeros de 1 a 10:
		0
		1
		2
		3
		4
		5
		6
		7
		8
		9
		10
		
2) Numbers.java:1: error: class, interface, or enum expected
public Class Numbers {
       ^
Numbers.java:3: error: class, interface, or enum expected
	public static void main (String[] args) {
	              ^
Numbers.java:6: error: class, interface, or enum expected
		System.out.println("Numeros de 1 a " + n +":");
		^
Numbers.java:7: error: class, interface, or enum expected
		for(int i=0; i<=n; i++)
		^
Numbers.java:7: error: class, interface, or enum expected
		for(int i=0; i<=n; i++)
		             ^
Numbers.java:7: error: class, interface, or enum expected
		for(int i=0; i<=n; i++)
		                   ^
Numbers.java:9: error: class, interface, or enum expected
	}
	^
7 errors

3) Numbers.java:1: error: class, interface, or enum expected
public Class Numbers {
       ^
Numbers.java:3: error: class, interface, or enum expected
	public static void main (String[] args) {
	              ^
Numbers.java:7: error: class, interface, or enum expected
		for(int i=0; i<=n; i++)
		^
Numbers.java:7: error: class, interface, or enum expected
		for(int i=0; i<=n; i++)
		             ^
Numbers.java:7: error: class, interface, or enum expected
		for(int i=0; i<=n; i++)
		                   ^
Numbers.java:9: error: class, interface, or enum expected
	}
	^
6 errors

4) DONE ! 

5) DONE 2!

«««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««

EXERCICIO 2 !

public class Square {
    // Desenha uma linha de n caracteres onde:
    // - o primeiro e o último caracteres são o caracter da variável 'a'
    // - todos os outros caracteres são o caracter da variável 'b'
    static void line(char a, char b, int n) {
	System.out.print(a);
	for (int i=1; i<=n-2; i++)
	    System.out.print(b);
	System.out.println(a);
    }

    // O procedimento executado inicialmente é sempre o main
    public static void main(String[] args) {	
	line('*','-',5);	    
    }
}

EXERCICIO 3 !!!!!!!!!!!
COM i

real	0m0.077s
user	0m0.064s
sys	0m0.016s

COM (i+i)


[up201706059@L813 esda]$ javac Primes.java 
[up201706059@L813 esda]$ time java Primes | wc -l
168

real	0m0.044s
user	0m0.042s
sys	0m0.008s
[up201706059@L813 esda]$ 










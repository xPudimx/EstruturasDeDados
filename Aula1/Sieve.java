public class Sieve {

    public static void sieve(int n, boolean prime[]){
		
	}

    public static void main(String[] args){
	
	int n=100000; 

	boolean[] prime = new boolean[n+1];

	sieve(n, prime);

	for (int i=2; i<=n; i++)
	    if (prime[i])
		System.out.println(i);
    }
}

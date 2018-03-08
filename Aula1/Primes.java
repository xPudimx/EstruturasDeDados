public class Primes {
    
    static boolean isPrime(int n)
    {
		for(int i=2;(i*i)<=n;i++)
			if(n%i==0 && n != i)
				return false;			
		
		return true;
	}
	public static void main(String[] arg)
	{
		int n=1000;
		for(int i=2;i<=n;i++)
			if (isPrime(i))
				System.out.println(i);		
	}
}

import java.lang.String;
public class BigNumber{

	private String number;
	//private int size;

	BigNumber(String n){
	
		//size = n.length();
		this.number=n;
	}

	public boolean equals(BigNumber n){
		return number.equals(n.number);
	}

	public String toString(){
		return number;
	}

	}
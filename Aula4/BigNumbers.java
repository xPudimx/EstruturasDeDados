import java.util.Objects

public class BigNumber{
	private String number;
	private int size;

	BigNumber(String n){
		size = n.length();
		this.number=n;
	}

}
import java.util.Scanner;


public class ED006{
	public static void main(String[] args) {
		int n,rotates,k;
		String line;
		CircularLinkedList<String> pessoas;
		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		for (int i=0; i < n; i++) {
			pessoas = new CircularLinkedList<String>();
			read.nextLine();
			rotates=read.nextLine().split(" ").length;
			k=read.nextInt();
			for (int j=0;j<k ;j++ ) {
				pessoas.addLast(read.next());				
			}
			System.out.println(pessoas);
				
			
			while(pessoas.size()>1){
				for (int v =0;v <rotates ;v++ )
					pessoas.rotate();
				System.out.println(pessoas.getFirst());
				pessoas.removeFirst();
			}
			if (pessoas.getLast() == "Carlos"){
				System.out.println(pessoas.getLast()+"...");
				System.out.println("O Carlos nao se livrou");
			}
			else System.out.println("O Carlos livrou-se (coitado do "+pessoas.getLast()+"!)");
				
		}

	}
}
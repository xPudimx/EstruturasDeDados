import java.util.Scanner;

public class Counting{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int L = ler.nextInt();
		int C = ler.nextInt();
		char[][] matriz = new char[L][C];
		ler.nextLine();
		for (int i=0; i<L; i++){
			String aux = ler.nextLine();
			for(int j=0; j<C; j++){
				matriz[i][j]=aux.charAt(j);
			}
		}
		int max = 0; //O maximo de cardinais e o numero de linha (ou colunas)
		int tempmax=0;
		int countmax=0;


		
		for(int i=0; i<L; i++){
			for(int j=0; j<C; j++){
				tempmax=0;
				int x=0;
				while (matriz[i+x][j]=='#' && (i+x)<L){ 
					x++;
					tempmax++;
				}
				if(tempmax > max)
					max=tempmax;
				if(tempmax != 0 && tempmax == max)
					countmax++;

				tempmax=0;
				int y=0;
				while (matriz[i][j+y]=='#' && (j+y)<C){
					y++;
					tempmax++;
				}
				if(tempmax > max)
					max=tempmax;
				if(tempmax != 0 && tempmax == max)
					countmax++;		
			}
		}
		System.out.println(max +" "+countmax);
	}
}
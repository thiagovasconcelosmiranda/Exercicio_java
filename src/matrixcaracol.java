
public class matrixcaracol {

	public static void main(String[] args) {

		int[][] matriz = new int[5][5];
		 int inicio = 0;
		 int n = 5;
		 int nlimite = n -1;
		 int c=1;
		  
		 while(c<=(n*n)) {	
			 for(int i=inicio; i<=nlimite; i++) {
			   matriz[inicio][i]=c++; 
		      }	
			 for(int i=inicio+1; i<=nlimite; i++) {
				 matriz[i][nlimite] = c++; 
			 }
			 for(int i=nlimite-1; i>=inicio; i--) {
				 matriz[nlimite][i] = c++; 
			 }
			 
			 for(int i=nlimite-1; i>=inicio+1; i--) {
				 matriz[i][inicio] = c++; 
			 }
			 inicio = inicio + 1;
			 nlimite = nlimite-1;
		}
		 for(int i =0; i < n; i++) {
        	 System.out.println();
        	 for(int j =0; j < n; j++) {
        		  System.out.print(matriz[i][j] +"\t");
        	 }
        }
		
	}
}

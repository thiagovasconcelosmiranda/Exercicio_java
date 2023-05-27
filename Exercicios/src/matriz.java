import java.security.SecureRandom;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		 
		final int linha = 5;
		final int coluna = 5;
		
		int[][] numeros = new int[linha][coluna];
		
		for(int i=0; i<linha; i++) {
			for(int j=0; j<coluna; j++) {
				
				numeros[i][j] = new SecureRandom().nextInt(100);
				
			}
		}
		
		for(int i=0; i<linha; i++) {
			for(int j=0; j<coluna; j++) {
              if(numeros[i][j] % 2 ==0) {
            	  System.out.printf("%d - ", numeros[i][j]);	
				}
				
			}
			System.out.printf("%n");
		}
		
		
	}

}

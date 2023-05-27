import java.util.Scanner;

public class mediarepeticao {

	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		
		float num, soma=0, media;
		int count=0;
		/*
		 * Estrutura de repetção usando for
		for(int i=1;i<5+1;i++) {
			System.out.println("Digite a nota do aluno");
			num = tecla.nextFloat();
			soma = soma += num;
			media = soma/i;
			
			System.out.println("Média " +media );
			
			if(media < 5) {
				System.out.println("Você respovado!"); 
			} else if(media >= 5 && media <= 7) {
				System.out.println("Você está de exame!");
			}else if(media >= 7) {
				System.out.println("Você está aprovado!");
			}
			
		}
		
		*/
		
		
		//estrutura de repetção usando While
		while(count <= 5) {
			 count++;
			 System.out.println("Digite a nota do aluno");
				num = tecla.nextFloat();
				
				soma = soma += num;
				media = soma/count;
				
				System.out.println("Média " +media );
				
				if(media < 5) {
					System.out.println("Você respovado!"); 
				} else if(media >= 5 && media <= 7) {
					System.out.println("Você está de exame!");
				}else if(media >= 7) {
					System.out.println("Você está aprovado!");
				}
		}
		
		
		
		
		

	}

}

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		float num1, num2, media;
		
		System.out.println("Digite a 1º nota do aluno");
		num1 = tecla.nextFloat();
		
		System.out.println("Digite a 2º nota do aluno");
		num2 = tecla.nextFloat();
		
		media = ((num1 + num2)/2);
		
		System.out.println("Sua média é "+ media); 
		
		if(media < 5) {
			System.out.println("Você respovado!"); 
		} else if(media >= 5 && media <= 7) {
			System.out.println("Você está de exame!");
		}else if(media >= 7) {
			System.out.println("Você está aprovado!");
		}
		
		

	}

}

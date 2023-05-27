
public class arrayPrimos {

	public static void main(String[] args) {
		
		int[] primos = new int[50] ;
		int contator;
		for(int i = 0; i<primos.length; i++) {
			primos[i] = i;
			contator = 0;
			for(int j=1; j< primos.length; j++) {
				if(primos[i] % j == 0) {
					contator++;
				}
			}
			if(contator==2) {
				 System.out.println(primos[i] + "");
			}
		}
	}
}

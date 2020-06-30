
public class Aplicacao {

	public static void main(String[] args) {
		
		//int x = 10; // tipo da variavel totalmente compativel com tipo de dado que esta sendo colocado dentro dela
		
		/*long x = 10;  x é uma variavel do tipo long logo eu estou armazenando uma variavel do tipo inteiro em long esta mudando
						o tipo de dado para inteiro = casting implicito */
		
		//long x = 10L; // sem casting
		
		/*double x = 35;  esta acontecendo um casting pois estou querendo*/
		
		//float x = 40.0F; 
		
		/*float x = (float) 40.0; /* CAsting Explicito convertendo 40.0 pra float pois 40.0 é um double */
		
		/*short x = 100; /*estou armazenando um short dentro de uma variavel short*/
		
		/*short x = 100000; /* o Java entende que o numero é um int e não é compativel com o tipo de variavel short*/
		
		/* short x = (short) 100000;
		 System.out.println(x);
		 */
		
		/*byte x = (byte) 130;
		 * System.out.println(x); = -126 pois o valor 130 não corresponde com tipo byte
		 */
		 
	}

}

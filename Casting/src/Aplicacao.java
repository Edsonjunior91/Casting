
public class Aplicacao {

	public static void main(String[] args) {
		
		//int x = 10; // tipo da variavel totalmente compativel com tipo de dado que esta sendo colocado dentro dela
		
		/*long x = 10;  x � uma variavel do tipo long logo eu estou armazenando uma variavel do tipo inteiro em long esta mudando
						o tipo de dado para inteiro = casting implicito */
		
		//long x = 10L; // sem casting
		
		/*double x = 35;  esta acontecendo um casting pois estou querendo*/
		
		//float x = 40.0F; 
		
		/*float x = (float) 40.0; /* CAsting Explicito convertendo 40.0 pra float pois 40.0 � um double */
		
		/*short x = 100; /*estou armazenando um short dentro de uma variavel short*/
		
		/*short x = 100000; /* o Java entende que o numero � um int e n�o � compativel com o tipo de variavel short*/
		
		/* short x = (short) 100000;
		 System.out.println(x);
		 */
		
		/*byte x = (byte) 130;
		 * System.out.println(x); = -126 pois o valor 130 n�o corresponde com tipo byte
		 */
		 
	}

}

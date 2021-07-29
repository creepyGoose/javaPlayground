/* Fun��o de Alta Ordem
 * � uma fun��o por parametro recebe
 *  outra fun��o ou que ela 
 * retorna uma fun��o que j� retorna outra
*/

package test;

public class AltaOrdem {
	public static void main(String[] args) {
		Calculo soma = (a,b) -> a+b;
		Calculo sub = (a,b) -> a-b;
		Calculo multi  = (a,b) -> a*b;
		Calculo div = (a,b) -> a/b;
		System.out.println(executarOperacao(soma, 1, 6));
		System.out.println(executarOperacao(sub, 8, 6));
		System.out.println(executarOperacao(multi, 1, 6));
		System.out.println(executarOperacao(div, 12, 6));
	} 
	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calculo(a,b);
	}

}

@FunctionalInterface
interface Calculo {
	public int calculo(int a, int b);
}


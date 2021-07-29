/* Função de Alta Ordem
 * É uma função por parametro recebe
 *  outra função ou que ela 
 * retorna uma função que já retorna outra
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


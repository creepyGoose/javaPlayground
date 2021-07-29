package test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
	public static void main(String[] args) {
	String[] nomes = {"Jo�o", "Silva", "Rio de Janeiro", "Brasil"};
	Integer[] numeros =  {1,2,3,4};
	imprimir(nomes);
}

public static void imprimir(String... nomes) {
	String nomesParaImprimir = "";
	for (int i = 0; i < nomes.length; i++) {
		if (nomes[i].equals("Jo�o")) {
			nomesParaImprimir+= ""+nomes[i];
		}
	}
	
	System.out.print("Nomes do for: " + nomesParaImprimir);
	
	Stream.of(nomes)
	 .filter(nome -> nome.equals("Jo�o"))
	 .collect(Collectors.joining()); //Apenas um nome
	
	Stream.of(nomes)
	.forEach(nome -> System.out.print(nomes));
     
	System.out.print("Nomes do Stream: " + nomesParaImprimir);


}
}
 

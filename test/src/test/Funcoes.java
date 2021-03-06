package test;

import java.util.function.Function;

public class Funcoes {
	public static void main(String[] args) {
		
		
		Function<String, String> reverseName = texto -> new StringBuilder(texto).reverse().toString();
		Function<String, Integer> convertToInt = string -> Integer.valueOf(string) * 2;
		System.out.println(reverseName.apply("Lucas"));
		System.out.println(convertToInt.apply("20"));
	}

}

 
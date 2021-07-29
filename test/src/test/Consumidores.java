package test;
import java.util.function.Consumer;

public class Consumidores {
	public static void main(String[] args) {
		Consumer<String> printFrase = System.out::println;
		//Consumer<String> printFrase2 = frase -> System.out.println(frase);
		printFrase.accept("Hello World");
		
	}

}

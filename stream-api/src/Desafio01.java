
import java.util.Arrays;
import java.util.List;

public class Desafio01 {

    public static void main(String[] args) throws Exception {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        /**
         * Desafio 1 - Mostre a lista na ordem numérica: Crie um programa que
         * utilize a Stream API para ordenar a lista de números em ordem
         * crescente e a exiba no console.
         */
        //numeros.stream().sorted().forEach(n -> System.out.println(n));
        numeros.stream()
                .sorted()
                .forEach(System.out::println);
    }
}


import java.util.Arrays;
import java.util.List;

public class Desafio08 {

    public static void main(String[] args) {

        /**
         * Desafio 8 - Somar os dígitos de todos os números da lista: Utilizando
         * a Stream API, realize a soma dos dígitos de todos os números da lista
         * e exiba o resultado no console.
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // int soma = numeros.stream()
        //         .reduce(0, (n1, n2) -> n1 + n2);
        // System.out.println("A soma de todos os números da lista é de " + soma + ".");
        
        int somaDigitos = numeros.stream()
                .map(n -> String.valueOf(n))
                .flatMapToInt(s -> s.chars())
                .map(Character::getNumericValue)
                .sum();
        
        System.out.println("A soma de todos os dígitos dos números da lista é de " + somaDigitos + ".");
    }

}

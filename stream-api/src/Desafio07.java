
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio07 {

    public static void main(String[] args) {

        /**
         * Desafio 7 - Encontrar o segundo número maior da lista: Com a ajuda da
         * Stream API, encontre o segundo número maior da lista e exiba o
         * resultado no console.
         */
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaOrdenada = numeros.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        
        if (!listaOrdenada.isEmpty()) {
            if (listaOrdenada.size() >= 2) {
                System.out.println("O segundo maior número da lista é o " + listaOrdenada.get(listaOrdenada.size() - 2) + ".");
            } else {
                System.out.println("A lista possui somente o número " + listaOrdenada.get(0) + ".");
            }
        }

    }
}

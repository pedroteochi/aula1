package Exercicio;
import java.util.*;

public class ExerciciosTest {
    public static void main(String[] args) {
        Exercicio ex = new Exercicio();
        
        // Testando método a
        System.out.println("Teste de imprimirLetras:");
        ex.imprimirLetras("Palavra");

        //Testando método b
        System.out.println("\nTeste de tabuada:");
        ex.tabuada(5);

        // Testando método c
        System.out.println("\nTeste de numerosAleatorios:");
        ex.numerosAleatorios();

        // Testando método d
        System.out.println("\nTeste de diaDaSemana:");
        ex.diaDaSemana(3);

        // Testando método e
        System.out.println("\nTeste de imprimirNomes:");
        List<String> nomes = Arrays.asList("Alice", "Bob", "Carol");
        ex.imprimirNomes(nomes);

        // Testando método f
        System.out.println("\nTeste de contarPares:");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Quantidade de pares: " + ex.contarPares(numeros));

        // Testando método g
        System.out.println("\nTeste de somaArray:");
        int[] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Soma dos números: " + ex.somaArray(arrayNumeros));

        // Testando método h
        System.out.println("\nTeste de calcularMedia:");
        double[] notas = {8.5, 7.0, 6.5, 9.0};
        System.out.println("Média das notas: " + ex.calcularMedia(notas));

        // Testando método i
        System.out.println("\nTeste de gerarVetorAleatorio:");
        int[] vetorAleatorio = ex.gerarVetorAleatorio(5, 10);
        System.out.println("Vetor gerado: " + Arrays.toString(vetorAleatorio));

        // Testando método j
        System.out.println("\nTeste de validarCPF:");
        System.out.println("CPF válido: " + ex.validarCPF("123.456.789-00"));
    }
}

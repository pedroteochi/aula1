package semana04;

public class App {
		public static void main(String[] args) {
			Impressora.imprimir();
			Impressora.imprimirFrase("Olá, Pessoal!");
			
			Impressora.imprimirCopia(10, "Eu amo Java!");
			
			
			
			String nomes = "Ana;Bia;Carlos";
			
			Impressora.imprimirSplit(nomes);
			
			System.out.println();
		}
}

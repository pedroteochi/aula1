package semana06;

public class Granja {

    public static void main(String[] args) {
        // Criando um objeto Galinha com id "1", cor "amarela", peso 50kg, preço 5 unidades monetárias, 1000 dias de vida
        Galinha galinha1 = new Galinha("1", "amarela", 50, 5, 1000);

        // Exibindo informações da galinha
        galinha1.mostrar();
        System.out.println(galinha1.toString());

        // Calculando idade e ovos por dia
        System.out.println("Esta galinha tem " + galinha1.getIdadeEmAnos() + " anos e produz " + galinha1.getOvosPorDia() + " ovos por dia.");
        
        // Exibindo total de ovos produzidos
        System.out.println("Total de ovos produzidos: " + galinha1.getTotalOvosProduzidos());
    }
}

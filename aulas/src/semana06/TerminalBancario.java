package semana06;

public class TerminalBancario {
    
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Pedro";

        System.out.println(conta1.depositar(1000));
        System.out.println(conta1.depositar(2000));
        System.out.println(conta1.sacar(1000));
        System.out.println(conta1.consultar());
        
    }

}

package semana06;

public class TerminalBancario {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Pedro";

        System.out.println(conta1.depositar(1000));
        System.out.println(conta1.consultar());

        System.out.println(conta1.sacar(100));
        System.out.println(conta1.sacar(100));

        ContaBancaria conta2 = new ContaBancaria();
        conta2.depositar(7000);

        ContaBancaria.realizarPix(conta2, conta1, 5000);
        System.out.println(conta1.consultar());
        System.out.println(conta2.consultar());

    }

}

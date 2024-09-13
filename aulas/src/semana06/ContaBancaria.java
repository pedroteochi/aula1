package semana06;

public class ContaBancaria {

    private final int VALOR_MAXIMO_SAQUE = 10000;
    private final int VALOR_MINIMO_SAQUE = 100;
    private double saldo;
    public String titular;

    

    /*
     * Acrescenta o valor receiver no saldo
     * @param valor - um valor > 0
     * @return - "Deposito realizado com sucesso" ou "Valor à ser digitado é inválido"
     */

    public String depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return "Deposito realizado com sucesso " + valor;
        }
        else{
            return "Valor à ser digitado é inválido " + valor;
        }
        
    }

    /*
     * retorna o valor atual do salto
     */

    public double consultar(){  
        return saldo;
    }
    

    public String sacar(double valor){
        if (valor < VALOR_MINIMO_SAQUE) {
            return "Valor digitado é menor que o valor mínimo de 100";
        }
        if (valor > VALOR_MAXIMO_SAQUE) {
            return "Valor digitado é maior que o valor máximo de 10000";
        }
        if (valor > saldo) {
            return "Valor digitado é maior que o saldo atual";
        }
        saldo -= valor;
        return "Saque realizado com sucesso, no valor de " + valor;
    }
   
       
    }







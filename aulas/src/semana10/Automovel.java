package semana10;

public class Automovel implements Motor, Capota {

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void desligar() {
        System.out.println("Desligando...");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    @Override
    public void abrir() {
        
        throw new UnsupportedOperationException("Unimplemented method 'abrir'");
    }

    @Override
    public void fechar() {
      
        throw new UnsupportedOperationException("Unimplemented method 'fechar'");
    }

}

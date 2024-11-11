package semana11;

public class Animal implements Fisio {
    @Override
    public void comer() {
        System.out.println("Comer");
    }

    @Override
    public void dormir() {
        System.out.println("Dormir");
    }

    @Override
    public void beber() {
        System.out.println("Beber");
    }
}

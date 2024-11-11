package semana11;

public interface ET implements Fisio{

    @Override
    public void comer(){
        System.out.println("Comer");

    }

    @Override
    public void beber(){
        System.out.println("Beber");
    }

    @Override
    public void dormir(){
        System.out.println("Dormir");
    }

}

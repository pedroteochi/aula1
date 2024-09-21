package semana06;

public class UsaGarrafa {
    public static void main(String[] args) {

       
        
        Garrafa garrafa1 = new Garrafa();
        Garrafa garrafa2 = new Garrafa();
        Garrafa garrafa3 = new Garrafa();

        garrafa1.setVolume(250);
        garrafa1.setPreco(100);
        garrafa2.setVolume(500);
        garrafa3.setVolume(850);

        System.out.println(garrafa1.getVolumeAtual());
        System.out.println(garrafa2.getVolumeAtual());
        System.out.println(garrafa3.getVolumeAtual());

        
        
    }
}

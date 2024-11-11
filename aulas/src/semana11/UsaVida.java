package semana11;

public class UsaVida {
    public static void main(String[] args) {
        Fisio f = new Pessoa();
        Vida.viver(f);

        Fisio f1 = new Animal();
        Vida.viver(f1);

        Fisio f2 = new ET();
        Vida.viver(f2);
    }
}

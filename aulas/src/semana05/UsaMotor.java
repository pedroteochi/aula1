package semana05;

public class UsaMotor {

    public static void main(String[] args) {
        Motor m = new Motor();
        Motor m2 = new Motor();

        m.mostrar();
        m.acelerar();
        m.acelerar();
        m.acelerar();
        m.mostrar();
        for(int i=0; i <= 100000; i++){
            m.acelerar();
        }
        m.mostrar();

    }
}

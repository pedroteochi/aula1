package semana09;

public class UsaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa p5 = new Pessoa();

        p1.setCpf(123456789);
        p2.setCpf(987654321);
        p3.setCpf(123456789);
        p4.setCpf(987654321);
        p5.setCpf(123456789);

        p1.setNome("Ana");
        p2.setNome("João");
        p3.setNome("Pedro");
        p4.setNome("Paula");
        p5.setNome("Maria");    

        p1.setConjuge(p2);
        p2.setConjuge(p3);
        p3.setConjuge(p4);
        p4.setConjuge(p5);
        p5.setConjuge(p1);

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        p4.mostrar();    
        p5.mostrar();
    }

}

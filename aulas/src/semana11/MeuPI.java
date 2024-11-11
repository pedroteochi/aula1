package semana11;
import java.awt.Frame;

public class MeuPI extends Frame
implements BotaoInter, TextoInter {

    public MeuPI(){
       bt.setText("Botao 1");
       tf.setText("Texto 1");
       setLayout(new FlowLayout());
       setBounds(100, 100, 300, 200);
       add(bt);
       add(tf);
    }

    public static void main(String[] args) {
        MeuPI pi = new MeuPI();
        pi.setVisible(true);
    }
}

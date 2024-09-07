package semana05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela extends JFrame{

    private JButton bt, bt2, btMes;
    private JTextField tf, tf2, tfMes;

    public Tela(){
        setTitle("My First Frame");
        setBounds(0, 0, 500, 200);
        setLayout(new FlowLayout());
        
        bt = new JButton("Contar");
        tf = new JTextField(10);
        add(bt);
        add(tf);
        
        bt2 = new JButton("Contar2");
        tf2 = new JTextField(10);
        add(bt2);
        add(tf2);

        btMes = new JButton("Mostrar o mês");
        tfMes = new JTextField(10);
        add(btMes);
        add(tfMes);

        btMes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{

        
               int n = Integer.parseInt(tfMes.getText());
               JOptionPane.showMessageDialog(btMes, Metodos.getMes(n));
                }
                catch(NumberFormatException e1){   
                    JOptionPane.showMessageDialog(btMes, "Forneça um número inteiro");
            }
            catch(ArrayIndexOutOfBoundsException e2){
                JOptionPane.showMessageDialog(btMes, "Forneça um número entre 1 e 12");
            }
            }
        });
        
        // Ação para o primeiro botão
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Thread t1 = new Thread(new Runnable() {
                    public void run() {
                        for (int i = 1; i <= 10; i++) {
                            tf.setText("" + i); // Atualiza tf (primeiro campo de texto)
                            try {
                                Thread.sleep(1000); // Pausa de 1 segundo
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                });
                t1.start();
            }
        });
        
        // Ação para o segundo botão
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Thread t2 = new Thread(new Runnable() {
                    public void run() {
                        for (int i = 1; i <= 10; i++) { // Corrigido o loop para contar até 10
                            tf2.setText("" + i); // Atualiza tf2 (segundo campo de texto)
                            try {
                                Thread.sleep(100); // Pausa de 0.1 segundo
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                });
                t2.start();
            }
        });
    }
    
    public static void main(String[] args) {
        Tela t = new Tela();
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Adicionada a opção de fechar o frame
    }
}

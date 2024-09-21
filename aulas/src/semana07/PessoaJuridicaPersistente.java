package semana07;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class PessoaJuridicaPersistente extends PessoaJuridica {
    private String s;

    public String gravar(){
        try {
            FileOutputStream fos = new FileOutputStream(cnpj + ".obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.flush();
            oos.close();
            s = "Objeto gravado com sucesso";
        } catch (Exception erro) {
            s = "Erro ao gravar objeto: " + erro;
        }
        return s;
    }

    public static PessoaJuridica ler(String cnpj){
        PessoaJuridica p = null;
        try {
            FileInputStream fis = new FileInputStream(cnpj + ".obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (PessoaJuridica) ois.readObject();
            ois.close();
        } catch (Exception erro) {
            System.out.println("Erro ao ler objeto: " + erro.getMessage());
        }
        return p;
    }
}

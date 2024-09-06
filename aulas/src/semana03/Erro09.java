package semana03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class Erro09 {
    public static void main(String[] args) throws FileSystemNotFoundException {
        // Tente ler um arquivo
        try {
            // O caminho para o arquivo que será lido deve ser fornecido corretamente
            BufferedReader br = new BufferedReader(new FileReader("caminho_do_arquivo.txt"));
            
            String linha;
            // Ler o arquivo linha por linha
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
            
            br.close(); // Lembre-se de fechar o BufferedReader
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

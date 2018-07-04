import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class app {

	public static void main(String[] args) throws IOException {
		InputStream fis = new FileInputStream("lorem.txt");/*Streams utilizado para ler binarios*/
		Reader isr = new InputStreamReader(fis);/*Readers utilizado para caracteres*/
		BufferedReader br = new BufferedReader(isr);/*Readers utilizado para conjunto de caracteres*/
		String linha = br.readLine();
		while(linha != null){
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}

}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Arquivo{

    private static Votacao voto;
    private static HashMap<String, Votacao> mapaVotacao = new HashMap<>();
    //private static List<Votacao> votacao = new ArrayList<Votacao>();

    public static Map<String, Votacao> readFile(String arquivoCSV) {
        BufferedReader br = null;
        String linha = "";
        try {
            br = new BufferedReader(new FileReader(arquivoCSV));
                while ((linha = br.readLine()) != null) {                	
                    String[] linhas = linha.split(";");
                    voto = mapaVotacao.get(linhas[0]);
                    if(voto != null){
                    	voto.addVotos();
                    }else{
                    	voto = new Votacao(linhas[0], linhas[1],(linhas[2].trim()), (linhas[3].toLowerCase()), 0);
                    }
                    mapaVotacao.put(linhas[0], voto);
                    //votacao.add(voto);
            }
            return mapaVotacao;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
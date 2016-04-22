
import java.util.Map;

/**
 * Created by ilegra on 20/04/2016.
 */
public class Executa {

    public static void main(String[] args) {
    	Map<String, Votacao> vot;
        ApuraVotacao apura = new ApuraVotacao();
        vot = Arquivo.readFile("C:\\Users\\ilegra\\Desktop\\ExercicioVotacao\\votos.txt");
        
        apura.contaVotos(vot);
        apura.contaVotosRepetidos(vot);
    }
}
import java.util.*;

/**
 * Created by ilegra on 20/04/2016.
 */
// Quantos disseram sim e quantos disseram nao?
// Quantos votaram mais de uma vez (nomes repetidos) e serão eliminados e qual
// partido que isso mais aconteceu?

public class ApuraVotacao {
	List<Votacao> votoRepetido = new ArrayList<>();
	Map<String, Integer> mapAux = new HashMap<String, Integer>();
	Votacao voto;
	int partido;
	int votosTotal = 0;
	int votosN = 0;
	int votosS = 0;
	int cont = 0;
	// Map votoRepetido = new HashMap<>();

	public void contaVotos(Map<String, Votacao> vot) {
		// vot.get(i).
		Set<String> key = vot.keySet();
		for (String k : key) {
			voto = vot.get(k);
			votosTotal += voto.getNVotos();
			if (voto.getVoto().equals("sim")) {
				votosS++;
			} else {
				votosN++;
			}
			System.out.println("Voto de:" + k + ". Partido:" + voto.getPartido() + ". Estado:" + voto.getEstado()
					+ ". Voto:" + voto.getVoto() + ". N de Votos: " + voto.getNVotos());
		}
		System.out.println("Total de votos é: " + votosTotal);
	}

	public int contaVotosRepetidos(Map<String, Votacao> vot) {
		votosTotal = 0;
		Set<String> key = vot.keySet();
		for (String k : key) {			
			voto = vot.get(k);			
			// votosTotal += voto.getNVotos();
			if (mapAux.containsKey(voto.getPartido())) {
				//votosTotal = mapAux.get(k);
				if(voto.getNVotos() > 1){
					votosTotal = voto.getNVotos() + mapAux.get(voto.getPartido());
					mapAux.put(voto.getPartido(), votosTotal);
				}
			}else{
				mapAux.put(voto.getPartido(), voto.getNVotos());
			}
		}
		Set<String> keyaux = mapAux.keySet();
		for (String k : keyaux) {
			if(mapAux.get(k) > 1){
				partido = mapAux.get(k);
				System.out.println("Partido com maior voto repetido é: " + k + ", " + partido);
				//mapAux.remove(k);
			}else{
				System.out.println("Os votos válidos são: "+k+", "+ mapAux.get(k));
				cont++;
			}
			
		}
		//System.out.println("Os votos válidos são: "+mapAux);
		return cont;
		
	}
	// REALIZAR TESTE DE SIZE

}

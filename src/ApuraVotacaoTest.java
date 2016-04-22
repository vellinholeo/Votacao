import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ApuraVotacaoTest {

	@Test
	public void test() {
		ApuraVotacao av = new ApuraVotacao();
		Arquivo arq = new Arquivo();		
		Map<String, Votacao> v = arq.readFile("C:\\Users\\ilegra\\Desktop\\ExercicioVotacao\\votos.txt");
		int retorno = 0;
		int retornoEsperado = 2;
		
		retorno = av.contaVotosRepetidos(v);
		assertEquals(retornoEsperado, retorno);
		System.out.println(retornoEsperado);
		System.out.println(retorno);		
		
	}	
	

}

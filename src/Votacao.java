/**
 * Created by ilegra on 20/04/2016.
 */
public class Votacao {

    private String partido;
    private String estado;
    private String voto;
    private String nome;
    private int nVotos =1;

    public Votacao(String n, String p, String e, String v, int nVotos){
        partido = p;
        estado = e;
        voto = v;
        nome = n;
        this.nVotos = 1;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getVoto() {
        return voto;
    }
    
    public int getNVotos(){
    	return nVotos;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addVotos(){
        nVotos++;
    }
    
}

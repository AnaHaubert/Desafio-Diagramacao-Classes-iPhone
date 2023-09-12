package aparelhos.repodutorMusicial;

public class Ipod implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música - iPod");
    }

    public void pausar() {
        System.out.println("Pausando música - iPod");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música - iPod");
    }
    
}

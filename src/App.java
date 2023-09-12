import aparelhos.aparelhoTelefonico.Celular;
import aparelhos.navegadorInternet.Computador;
import aparelhos.repodutorMusicial.Ipod;
import aparelhos.iPhone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Celular celular = new Celular();
        celular.ligar();
        celular.atender();
        celular.iniciarCorreioVoz();

        Computador computador = new Computador();
        computador.exibirPagina();
        computador.adicionarNovaAba();
        computador.atualizarPagina();

        Ipod ipod = new Ipod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

        Iphone iphone = new Iphone();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();




    }
}

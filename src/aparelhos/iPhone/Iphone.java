package aparelhos.iPhone;

import aparelhos.aparelhoTelefonico.AparelhoTelefonico;
import aparelhos.navegadorInternet.NavegadorInternet;
import aparelhos.repodutorMusicial.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    //aparelho telefônico
    public void ligar() {
        System.out.println("Ligando - iPhone");
    }

    public void atender() {
        System.out.println("Atendendo - iPhone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz - iPhone");
    }

    //navegador de internet
    public void exibirPagina() {
        System.out.println("Exibindo página - iPhone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba - iPhone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página - iPhone");
    }

    //reprodutor musical
    public void tocar() {
        System.out.println("Tocando música - iPhone");
    }

    public void pausar() {
        System.out.println("Pausando música - iPhone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música - iPhone");
    }
    
}

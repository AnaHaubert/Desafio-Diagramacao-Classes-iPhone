package aparelhos.aparelhoTelefonico;

public class Celular implements AparelhoTelefonico{

    public void ligar() {
        System.out.println("Ligando - celular");
    }

    public void atender() {
        System.out.println("Atendendo - celular");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz - celular");
    }
}

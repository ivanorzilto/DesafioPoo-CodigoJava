public class App {

    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.atualizarPagina();
        iphone.exibirPagina("www.apple.com");
        iphone.adicionarNovaAba();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Gratitude");
        iphone.ligar("1234567");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}

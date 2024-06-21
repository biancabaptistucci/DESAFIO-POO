package Iphone.Funcionalidades;

public class Dispositivo implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    //Funcionalidades Reprodutor Musical
    
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada");
        System.out.println("      ");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    //Funcionalidades Aparelho Telefonico
    
    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    public void ligar() {
        System.out.println("Ligando para o número");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        System.out.println("    ");
    }

     //Funcionalidades Aparelho NavegadorInternet

     public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }
}
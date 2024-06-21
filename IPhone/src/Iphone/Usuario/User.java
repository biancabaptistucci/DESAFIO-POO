package Iphone.Usuario;

import Iphone.Funcionalidades.Dispositivo;

public class User {
    public static void main(String[] args) {
        Dispositivo meuDispositivo = new Dispositivo();

        // Usando funcionalidades Musica
        meuDispositivo.selecionarMusica("Snuff - Slipknot.");
        meuDispositivo.tocar();
        meuDispositivo.pausar();
       
        // Usando funcionalidades Telefone
        meuDispositivo.ligar();
        meuDispositivo.atender();
        meuDispositivo.iniciarCorreioVoz();

        // Usando funcionalidades Internet
        meuDispositivo.exibirPagina("https://unsplash.com/pt-br");
        meuDispositivo.adicionarNovaAba();
        meuDispositivo.atualizarPagina();
    }
}
package smartphone;

import java.util.Scanner;

import smartphone.musicas.ReprodutorMusica;
import smartphone.navegador.NavegadorInternet;
import smartphone.telefone.AparelhoTelefonico;

public class Smartphone implements ReprodutorMusica, AparelhoTelefonico, NavegadorInternet {
    //Interface ReprodutorMusica
    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a música " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica() {
        String[] musicas = {"Gurenge", "Again", "Rain", "Mesayume Chasing", "Sora Ni Utaeba"};
        Scanner scan = new Scanner(System.in);
        String musica;

        System.out.println("Lista de músicas");
        for(int i = 0; i < musicas.length; i++) {
            System.out.println(i+1 + " - " + musicas[i]);
        }

        System.out.println("\nSelecione uma música");

        try{
            int idMusic = scan.nextInt();
            musica = musicas[idMusic-1];
            this.tocar(musica);
        }
        catch(RuntimeException e) {
            System.out.println("\nMúsica não encontrada");
        }

        scan.close();
    }

    //Interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    //Interface NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo páginas web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página web");
    }
}
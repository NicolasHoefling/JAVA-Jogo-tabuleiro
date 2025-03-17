package nicolashoefling.jogotabuleiro;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private Tabuleiro meuTabuleiro;
    private List<Jogador> meusJogadores;
    private Dado meuDado;
    private int jogadorAtual;

    public Jogo(int numeroCasas, int quantidadeJogadores) {
        this.meuTabuleiro = new Tabuleiro(numeroCasas);
        this.meuDado = new Dado();
        this.meusJogadores = new ArrayList<>();
        this.jogadorAtual = 0;

        for (int i = 1; i <= quantidadeJogadores; i++) {
            meusJogadores.add(new Jogador(i));
        }
    }

    public void proximaJogada() {
        Jogador jogador = meusJogadores.get(jogadorAtual);
        meuDado.rolar();
        int valorDado = meuDado.getNumeroAtual();
        jogador.jogar(valorDado, meuTabuleiro.getNumeroCasas());

        System.out.println("\nJogador " + jogador.getMeuNumero() + " rolou: " + valorDado);
        System.out.println("Agora está na casa: " + jogador.getCasaAtual());

        // Verificar se o jogador venceu
        if (jogador.getCasaAtual() >= meuTabuleiro.getNumeroCasas()) {
            System.out.println("Jogador " + jogador.getMeuNumero() + " venceu!");
            return;
        }

        jogadorAtual = (jogadorAtual + 1) % meusJogadores.size();
    }

    public void mostrarPosicoes() {
        for (Jogador j : meusJogadores) {
            System.out.println("\nJogador " + j.getMeuNumero() + " está na casa " + j.getCasaAtual());
        }
    }
}


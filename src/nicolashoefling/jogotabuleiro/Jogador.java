package nicolashoefling.jogotabuleiro;

public class Jogador {
    private int casaAtual;
    private int meuNumero;

    public Jogador(int numero) {
        this.meuNumero = numero;
        this.casaAtual = 0; // Inipos 0
    }

    public void jogar(int valorDado, int limiteTabuleiro) {
        casaAtual += valorDado;
        if (casaAtual >= limiteTabuleiro) {
            casaAtual = limiteTabuleiro; // gg
        }
    }

    public int getCasaAtual() {
        return casaAtual;
    }

    public int getMeuNumero() {
        return meuNumero;
    }
}


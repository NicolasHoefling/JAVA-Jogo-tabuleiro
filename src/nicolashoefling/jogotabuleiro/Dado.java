package nicolashoefling.jogotabuleiro;

import java.util.Random;

public class Dado {
    private int numeroAtual;

    public void rolar() {
        Random random = new Random();
        numeroAtual = random.nextInt(6) + 1; // numero aleatorio
    }

    public int getNumeroAtual() {
        return numeroAtual;
    }
}

package nicolashoefling.jogotabuleiro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private Jogo jogo;

    public Main() {
        setTitle("Jogo Tabuleiro Virtual");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton btnNovoJogo = new JButton("Nova Partida");
        JButton btnExecutarJogada = new JButton("Executar Jogada");
        JButton btnMostrarPosicoes = new JButton("Informar Posições");
        JButton btnSair = new JButton("Sair");

        add(btnNovoJogo);
        add(btnExecutarJogada);
        add(btnMostrarPosicoes);
        add(btnSair);

        btnNovoJogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogo = new Jogo(20, 4);
                JOptionPane.showMessageDialog(null, "Jogo iniciado!");
            }
        });

        btnExecutarJogada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jogo != null) {
                    jogo.proximaJogada();
                } else {
                    JOptionPane.showMessageDialog(null, "Comece uma partida primeiro meu amigo!");
                }
            }
        });

        btnMostrarPosicoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jogo != null) {
                    jogo.mostrarPosicoes();
                } else {
                    JOptionPane.showMessageDialog(null, "Comece uma partida primeiro meu amigo!");
                }
            }
        });

        btnSair.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

package server;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class JogoDaVelha extends JFrame {

    String jgr1 = null;
    String jgr2 = null;
    JButton bt[] = new JButton[9];
    JLabel placar = new JLabel("PLACAR");
    JLabel px = new JLabel();
    JLabel po = new JLabel();
    JLabel emp = new JLabel();
    int JGDR1 = 0, JGDR2 = 0, EMPT = 0;
    boolean xo = false;
    boolean[] click = new boolean[9];
    private String String;

    public JogoDaVelha() {
        String jogador1 = "", jogador2 = null;

        jogador1 = JOptionPane.showInputDialog("DIGITE O NOME DO JOGADOR X: ");
        this.jgr1 = jogador1.toUpperCase();

        jogador2 = JOptionPane.showInputDialog("DIGITE O NOME DO JOGADOR O: ");
        this.jgr2 = jogador2.toUpperCase();

        px.setText(jgr1 + ":  " + JGDR1);
        po.setText(jgr2 + ":  " + JGDR2);
        emp.setText("EMPATES:  " + EMPT);

        setVisible(true);
        setTitle("Jogo da Velha - Sistemas Distribuídos"); 
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250, 100, 700, 500);
        add(placar);
        add(px);
        add(po);
        add(emp);
        placar.setBounds(400, 50, 100, 30);
        px.setBounds(400, 75, 100, 30);
        po.setBounds(490, 75, 100, 30);
        emp.setBounds(580, 75, 100, 30);
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                add(bt[cont]);
                bt[cont].setBounds((100 * i) + 20, (100 * j) + 100, 95, 95);
                bt[cont].setFont(new Font("Arial", Font.BOLD, 40));
                cont++;
            }
        }
        for (int i = 0; i < 9; i++) {
            click[i] = false;
        }
        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (click[0] == false) {
                    click[0] = true;
                    jogada(bt[0]);
                }
            }
        });
        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (click[1] == false) {
                    click[1] = true;
                    jogada(bt[1]);
                }
            }
        });
        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (click[2] == false) {
                    click[2] = true;
                    jogada(bt[2]);
                }
            }
        });
        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (click[3] == false) {
                    click[3] = true;
                    jogada(bt[3]);
                }
            }
        });
        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (click[4] == false) {
                    click[4] = true;
                    jogada(bt[4]);
                }
            }
        });
        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (click[5] == false) {
                    click[5] = true;
                    jogada(bt[5]);
                }
            }
        });
        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (click[6] == false) {
                    click[6] = true;
                    jogada(bt[6]);
                }
            }
        });
        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (click[7] == false) {
                    click[7] = true;
                    jogada(bt[7]);
                }
            }
        });
        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (click[8] == false) {
                    click[8] = true;
                    jogada(bt[8]);
                }
            }
        });
    }

    public void jogada(JButton btn) {
        if (xo) {
            btn.setText("O");
            xo = false;
        } else {
            btn.setText("X");
            xo = true;
        }
        ganhou();
    }

    public void atualizar() {
        px.setText(jgr1 + ":  " + JGDR1);
        po.setText(jgr2 + ":  " + JGDR2);
        emp.setText("EMPATES:  " + EMPT);
    }

    public void ganhou() {
        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if (click[i] == true) {
                cont++;
            }
        }
        if (bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X"
                || bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X"
                || bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X"
                || bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X"
                || bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X"
                || bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X"
                || bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X"
                || bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X") {

            JOptionPane.showMessageDialog(null, jgr1 + " GANHOU");
            JGDR1++;
            atualizar();
            Limpar();
        } else if (bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O"
                || bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O"
                || bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O"
                || bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O"
                || bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O"
                || bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O"
                || bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O"
                || bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O") {

            JOptionPane.showMessageDialog(null, jgr2 + " GANHOU");
            JGDR2++;
            atualizar();
            Limpar();
        } else if (cont == 9) {
            JOptionPane.showMessageDialog(null, "HOUVE EMPATE");
            EMPT++;
            atualizar();
            Limpar();
        }
    }

    public void Limpar() {
        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            click[i] = false;
        }
    }

    public static void main(String[] args) {

        new JogoDaVelha();

    }

}

package udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aplikacjezwielomaramkami extends JFrame {

    public aplikacjezwielomaramkami(){
        initComponents();
    }
    public void initComponents(){
        this.setTitle("Aplikacje z wieloma ramkami");
        this.setBounds(300,300,300,300);

        this.getContentPane().add(panel, BorderLayout.CENTER);

        panel.add(nowaRamka);

        nowaRamka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NowaRamka(taRamka).setVisible(true);
            }
        });



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JFrame taRamka = this;
    private JPanel panel = new JPanel();
    private JButton nowaRamka = new JButton("Stworz Ramkę");

    public static void main(String[] args) {
        new aplikacjezwielomaramkami().setVisible(true);
    }
}

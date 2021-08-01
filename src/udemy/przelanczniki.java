package udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class przelanczniki  extends JFrame {

    public przelanczniki() {
        initComponents();
    }

    public void initComponents() {
        this.setTitle("Grupy przełączników Radio");
        this.setBounds(300, 300, 300, 300);
        panel2.add(etykieta);

        zbudujPrzelancznikRozmiar("Mały", 15);
        zbudujPrzelancznikRozmiar("Sredni", 25);
        zbudujPrzelancznikRozmiar("Duży", 35);

        zbudujPrzelancznikKolor("Zielony", Color.GREEN);
        zbudujPrzelancznikKolor("Czerwony", Color.RED);
        zbudujPrzelancznikKolor("Niebieski", Color.BLUE);

        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);
        this.getContentPane().add(panel3, BorderLayout.CENTER);

        this.setDefaultCloseOperation(3);
    }

    public void zbudujPrzelancznikRozmiar(String name, final int rozmiar){
        JRadioButton przeloncznik = new JRadioButton(name);
        przeloncznik.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                etykieta.setFont(new Font("Monospace", Font.PLAIN, rozmiar));
            }
        });

        groupSize.add(przeloncznik);
        panel.add(przeloncznik);
    }

    public void zbudujPrzelancznikKolor(String name, final Color k){
        JRadioButton przelancznik = new JRadioButton(name);

        przelancznik.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                etykieta.setForeground(k);
            }
        });

        groupColor.add(przelancznik);
        panel3.add(przelancznik);
    }

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel etykieta = new JLabel("Coś");
    ButtonGroup groupSize = new ButtonGroup();
    ButtonGroup groupColor = new ButtonGroup();


    public static void main(String[] args) {

        new przelanczniki().setVisible(true);
    }

}
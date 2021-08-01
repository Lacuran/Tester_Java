package udemy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pasekmenu extends JFrame {

    public pasekmenu(){
        initComponents();
    }

    public void initComponents(){
        this.setTitle("Pasek Menu");
        this.setBounds(300,300,300,300);
        this.setJMenuBar(pasekMenu);

        JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));

        JMenuItem podMenuNowy = menuPlik.add(new JMenuItem("Nowy"));
        podMenuNowy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tu jest kod  który tworzy nowy plik");
            }
        });

        menuPlik.addSeparator();
        final JMenuItem podMenuZapisz = menuPlik.add(new JMenuItem("Zapisz"));
        podMenuZapisz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tutaj pojawia się kod opcji zapisu");
            }
        });

        menuPlik.add(new JMenuItem("Wczytaj"));

        menuPlik.addSeparator();
        JMenu menuOpcje = new JMenu("Opcje");
        menuPlik.add(menuOpcje);

        menuOpcje.add(new JMenuItem("Opcja 1"));
        menuOpcje.add(new JMenuItem("Opcja 2"));
        menuOpcje.add(tylkoDoOdczytu);

        tylkoDoOdczytu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tylkoDoOdczytu.isSelected()) {
                    podMenuZapisz.setEnabled(false);
                    System.out.println("Zapis został zablokowany");
                } else
                    podMenuZapisz.setEnabled(true);
                    System.out.println("Zapis został odblokowany");
            }
        });

        JMenu menuPomoc = pasekMenu.add(new JMenu("Pomoc"));
        menuPomoc.add(new JMenuItem("FAQ"));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem tylkoDoOdczytu= new JCheckBoxMenuItem("Tylko do odczytu");

    public static void main(String[] args) {
        new pasekmenu().setVisible(true);
    }
}

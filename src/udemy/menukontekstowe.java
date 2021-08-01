package udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class menukontekstowe extends JFrame {
    public menukontekstowe(){
        initComponents();
    }
    public void initComponents(){
        this.setTitle("Menu Kontekstowe");
        this.setBounds(300,300,300,300);

        final JPopupMenu menuKontekstowe = new JPopupMenu();

        menuKontekstowe.add(new JMenuItem("Kopiuj"));
        menuKontekstowe.add(new JMenuItem("Wklej"));
        menuKontekstowe.add(new JMenuItem("Wytnij"));
        menuKontekstowe.addSeparator();
        menuKontekstowe.add(new JMenuItem(new AbstractAction("Zamknij") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Zamykam program");
                System.exit(0);
            }
        }));


        this.getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {

                System.out.println("Released");

                if (e.getClickCount() == 3 && e.getButton() == MouseEvent.BUTTON1 && e.isShiftDown())
                    JOptionPane.showMessageDialog(rootPane, "Aleś się naklikał lewym przyciskiem myszy");

                if (e.isPopupTrigger())
                    menuKontekstowe.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        /*
        this.getContentPane().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Klik");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Nacik");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Zwolnienie");

                if (e.getClickCount() == 3 && e.getButton() == MouseEvent.BUTTON1)
                    JOptionPane.showMessageDialog(rootPane, "Aleś się naklikał lewym przyciskiem myszy");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("wszedłem sobie");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("odszedłem");
            }
        });

         */

        this.getContentPane().add(testowiec, BorderLayout.SOUTH);
        testowiec.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {

                System.out.println("Released");

                if (e.getClickCount() == 3 && e.getButton() == MouseEvent.BUTTON1 && e.isShiftDown())
                    JOptionPane.showMessageDialog(rootPane, "Aleś się naklikał lewym przyciskiem myszy");

                if (e.isPopupTrigger())
                    menuKontekstowe.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JButton testowiec = new JButton("test");

    public static void main(String[] args) {
        new menukontekstowe().setVisible(true);
    }
}

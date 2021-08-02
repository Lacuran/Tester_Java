package udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class zakladki extends JFrame {
    public zakladki(){
        initComponents();
    }
    public void initComponents(){
        this.setTitle("Zakładki");
        this.setBounds(300,300,600,300);

        zakladki.addTab("Tab 1", new JLabel("to jest pierwszy"));
        zakladki.setMnemonicAt(0, KeyEvent.VK_T);

        JPanel panel = new JPanel();
        panel.add(new JButton("tescior"));

        zakladki.addTab("Tab 2", new ImageIcon("blue.png"), panel, "Testowy test");

        zakladki.addTab("Video kurs", panelTworzenia);
        panelTworzenia.add(new JLabel("Stwórz nowy plik o nazwie:"));
        JTextField nazwaNowejZakladki = new JTextField(7);
        panelTworzenia.add(nazwaNowejZakladki);
        JButton stworzZakladke = new JButton("Stwórz");
        panelTworzenia.add(stworzZakladke);

        stworzZakladke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panelTekstowy = new JPanel();
                panelTekstowy.setLayout(new GridLayout(1, 1));
                JTextArea obszarTekstowy = new JTextArea();
                panelTekstowy.add(new JScrollPane(obszarTekstowy));

                zakladki.addTab(nazwaNowejZakladki.getText()+".txt", panelTekstowy);
                zakladki.setSelectedIndex(zakladki.getTabCount()-1);

                obszarTekstowy.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if (!(tytulZakladki+e.getKeyChar()).equals(przedZmianaObszaruTekstowego) && czyToAscii(e.getKeyChar()) && flagaZapisu){
                            przedZmianaObszaruTekstowego = tytulZakladki + e.getKeyChar();
                            zakladki.setTitleAt(indexZakladki, tytulZakladki+"*");
                            System.out.println("test");
                            flagaZapisu  = false;
                        }
                        else if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S && !flagaZapisu){
                           zakladki.setTitleAt(indexZakladki, tytulZakladki);
                           System.out.println("Zapisujemy");
                           flagaZapisu = true;
                        }
                    }

                    private boolean czyToAscii(char zn){
                        for (int i = 0; i < 255; i++)
                            if (zn == i)
                                return true;
                        return false;
                    }

                    String przedZmianaObszaruTekstowego = "";
                    int indexZakladki = zakladki.getSelectedIndex();
                    String tytulZakladki = zakladki.getTitleAt(indexZakladki);
                    boolean flagaZapisu = true;

                });
            }
        });

        zakladki.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        this.getContentPane().add(zakladki);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JTabbedPane zakladki = new JTabbedPane();
    private JPanel panelTworzenia = new JPanel();

    public static void main(String[] args) {
        new zakladki().setVisible(true);
    }
}

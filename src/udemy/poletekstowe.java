package udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class poletekstowe  extends JFrame {

    public poletekstowe(){
        initComponents();
    }

    public void initComponents(){
        this.setTitle("Przeszukiwacz Tekstu");
        this.setBounds(300,300,400,300);

        panelSzukania.add(znajdz);
        panelSzukania.add(szukany);
        panelSzukania.add(etykietaI);
        panelSzukania.add(zamien);
        panelSzukania.add(etykietaNa);
        panelSzukania.add(nowyTekst);

        //obszarTekstowy.selectAll(); - zaznacza cały tkst
        //obszarTekstowy.select(0, 10);- zaznacza obszar, od kąd do kąd
        //obszarTekstowy.replaceSelection("lala"); - zamienia obszar który jest zaznaczony aktualnie
        //obszarTekstowy.replaceRange("lala", 0,2); - range  ang. zasięg, podmeiniamy na string z danego obszaru
        //obszarTekstowy.insert("dodajemy string",1);
        //obszarTekstowy.append(" dołanczone od końca");
        //obszarTekstowy.select(obszarTekstowy.getText().indexOf("To"),obszarTekstowy.getText().indexOf("To") +"To".length());

        znajdz.addActionListener(new znajdowanieHandler());
        zamien.addActionListener(new zamienianieHandler());
        this.getContentPane().add(obszarPrzewijania, BorderLayout.NORTH);
        this.getContentPane().add(panelSzukania, BorderLayout.CENTER);

        this.setDefaultCloseOperation(3);
    }

    private class znajdowanieHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText(), poczatekSzukanego + szukany.getText().length());

            if (poczatekSzukanego == -1){
                poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText());
            }

            if (poczatekSzukanego >= 0 && szukany.getText().length() > 0) {
                obszarTekstowy.requestFocus();
                obszarTekstowy.select(poczatekSzukanego, poczatekSzukanego + szukany.getText().length());
            }
        }
        private int poczatekSzukanego = 0;
    }

    private class zamienianieHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd()) {
                zamienTekst();
            }
            else {
                znajdz.doClick(0);
                if (obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd())
                zamienTekst();
            }
        }
        private void zamienTekst(){
            obszarTekstowy.requestFocus();
            int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy chcesz zamienić \"" + szukany.getText() + "\" na \"" + nowyTekst.getText() + "\"", "Uwaga, nastąpi zmiana", JOptionPane.YES_NO_OPTION);
            if  (opcja == 0) {
                obszarTekstowy.replaceRange(nowyTekst.getText(), obszarTekstowy.getSelectionStart(), obszarTekstowy.getSelectionEnd());
            }
        }
    }

    private JTextArea obszarTekstowy = new JTextArea("To jest testowy tekst o testowy charakterze dla testerów", 7, 10);
    private JScrollPane obszarPrzewijania = new JScrollPane(obszarTekstowy);

    private JPanel panelSzukania = new JPanel();
    private JButton znajdz = new JButton("Znajdź");
    private JLabel etykietaI = new JLabel("i");
    private JButton zamien = new JButton("Zamień");
    private JLabel etykietaNa = new JLabel("na");

    private JTextField nowyTekst = new JTextField(6);
    private JTextField szukany = new JTextField(6);

    public static void main(String[] args) {
        new poletekstowe().setVisible(true);
    }
}

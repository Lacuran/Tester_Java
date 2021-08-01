package udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class dzialania extends JFrame {

    public dzialania(){
        initComponents();
    }

    public void initComponents(){
        //tytuł i rozmiar okna
        this.setTitle("Działania");
        this.setBounds(300,300,300,300);
        this.setJMenuBar(pasekMenu);

        //menu button plik
        JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
        menuPlik.setMnemonic('P');

        //menu button nowy
        JMenuItem podMenuNowy = menuPlik.add(new JMenuItem("Nowy"));
        podMenuNowy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tu jest kod  który tworzy nowy plik");
            }
        });


        //menu zapisz
        menuPlik.addSeparator();

        final Action actionSave = new ActionSave("Zapisz", "Zapisuje na dysku", "ctrl S", KeyEvent.VK_Z);

        final JMenuItem podMenuZapisz = menuPlik.add(actionSave);
        buttonZapisz = new JButton(actionSave);
        actionSave.setEnabled(false);

        /*
        podMenuZapisz.setEnabled(false);
        podMenuZapisz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Zapisujemy na dysku");
                podMenuZapisz.setEnabled(flagaOpbszaruTekstowego = false);
            }
        });
        podMenuZapisz.setToolTipText("Zapisanie pliku na dysku");
        podMenuZapisz.setMnemonic('Z');
        podMenuZapisz.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        //podMenuZapisz.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK)); - inna możliwość zapisu
        */

        //menu wczytaj
        menuPlik.add(new JMenuItem("Wczytaj"));


        //menu opcje
        menuPlik.addSeparator();
        JMenu menuOpcje = new JMenu("Opcje");
        menuPlik.add(menuOpcje);

        menuOpcje.add(new JMenuItem("Opcja 1"));
        menuOpcje.add(new JMenuItem("Opcja 2"));
        menuOpcje.add(tylkoDoOdczytu);

        //opcja checkbox tylko do odczytu
        tylkoDoOdczytu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tylkoDoOdczytu.isSelected()) {
                    actionSave.setEnabled(false);

                } else
                    actionSave.setEnabled(flagaOpbszaruTekstowego);
            }
        });

        //menu pomoc
        JMenu menuPomoc = pasekMenu.add(new JMenu("Pomoc"));
        menuPomoc.add(new JMenuItem("FAQ"));

        //obszar tekstowy
        obszarTekstowy.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (tylkoDoOdczytu.isSelected())
                    e.consume();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (tylkoDoOdczytu.isSelected())
                    e.consume();
                else if (!(obszarTekstowy.getText() + e.getKeyChar()).equals(przedZmianaObszarurTekstowego) && czyToAscii(e.getKeyChar())){
                    przedZmianaObszarurTekstowego = obszarTekstowy.getText() + e.getKeyChar();
                    actionSave.setEnabled(flagaOpbszaruTekstowego = true);
                }
                System.out.println(obszarTekstowy.getText() + e.getKeyChar());
            }
        });

        //reszta buttonów
        this.getContentPane().setLayout(new GridLayout(2,1));
        this.getContentPane().add(obszarTekstowy);
        this.getContentPane().add(buttonZapisz);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //wszelkie przycikski i meu
    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem tylkoDoOdczytu= new JCheckBoxMenuItem("Tylko do odczytu");
    private JRadioButtonMenuItem radio;
    private JTextArea obszarTekstowy = new JTextArea();
    private boolean flagaOpbszaruTekstowego = false;
    private String przedZmianaObszarurTekstowego = "";
    private JButton buttonZapisz;

    //ustawienia przycisku zapisz
    private class ActionSave extends AbstractAction{
        public ActionSave(String nazwa, String podpowiedz, String klawiaturowySkrot, int mnemonicKey){
            this.putValue(Action.NAME, nazwa);
            this.putValue(Action.SHORT_DESCRIPTION, podpowiedz);
            this.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(klawiaturowySkrot));
            //this.putValue(Action.SMALL_ICON, ikona); // ikone trzeba wrzucic do dysku
            this.putValue(Action.MNEMONIC_KEY, mnemonicKey);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ZAPISUJEMY NA DYSKU");
            this.setEnabled(flagaOpbszaruTekstowego = false);
        }
    }

    //sprawdza czy znak jest w ASCII
    private boolean czyToAscii(char zn){
        for (int i = 0; i < 255; i++)
            if (zn == i)
                return true;

        return false;
    }

    //okno naszego programu ustawione na true
    public static void main(String[] args) {
        new dzialania().setVisible(true);
    }
}

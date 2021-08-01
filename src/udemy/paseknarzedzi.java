package udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class paseknarzedzi extends JFrame {
    public paseknarzedzi(){
        initComponents();
    }

    //dorobić ikonki do tego zadania
    public void initComponents(){
        this.setTitle("Pasek narzędzi");
        this.setBounds(300,300,300,300);
        pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na zielony", new ImageIcon("green.png"), Color.green)));
        pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na czerwony", new ImageIcon("red.png"), Color.red)));
        pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na niebieski", new ImageIcon("blue.png"), Color.blue)));
        pasekNarzedzi.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                aktywny = null;
            }
        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(aktywny != null)
                panel.setBackground((Color) aktywny.getAction().getValue("kolor"));
            }
        });
        this.getContentPane().setLayout(new GridLayout(2, 1));
        this.getContentPane().add(pasekNarzedzi);
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    JToolBar pasekNarzedzi = new JToolBar("Nazwa Nowej Ramki");
    JButton button = new JButton("Wyłącz malowanie");
    JPanel panel = new JPanel();
    KolorowyButton aktywny = null;

    private class ActionColor extends AbstractAction{

        public ActionColor(String toolTip, Icon icon, Color colour){
            this.putValue(Action.SHORT_DESCRIPTION, toolTip);
            this.putValue(Action.SMALL_ICON, icon);
            this.putValue("kolor", colour);
        }

        public void actionPerformed(ActionEvent e){
            aktywny = (KolorowyButton) e.getSource();
        }
    }

    private class KolorowyButton extends JButton{
        public KolorowyButton(ActionColor actionColor){
            super (actionColor);

            this.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    for (int i = 0; i < pasekNarzedzi.getComponentCount(); i++){
                        if (pasekNarzedzi.getComponent(i) instanceof KolorowyButton) {
                            KolorowyButton tmp = (KolorowyButton) pasekNarzedzi.getComponent(i);
                            tmp.setBackground(Color.WHITE);
                            tmp.setZaznaczony(false);
                            panel.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("wypelnienie.png").getImage(),new Point(0, 0), "Nasz Kursorek"));

                        }
                    }

                    ten.setBackground((Color)actionColor.getValue("kolor"));
                    ten.setZaznaczony(true);
                }
            });
        }

        public void setZaznaczony(boolean zazn){
            this.zaznaczony = zazn;
        }

        KolorowyButton ten =  this;
        boolean zaznaczony = false;
    }

    public static void main(String[] args) {
        new paseknarzedzi().setVisible(true);
    }
}


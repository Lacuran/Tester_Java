package udemy;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Krawedzie extends JFrame{

    public Krawedzie(){
        initComponents();
    }
    public void initComponents(){
        this.setTitle("Krawedzie");
        this.setBounds(300,300,300,300);

        dodajPrzelacznik("createEchedBorder", BorderFactory.createEtchedBorder());
        dodajPrzelacznik("createLowerBevelBorder", BorderFactory.createLoweredBevelBorder());

        //panelRadio.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        panelRadio.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Krawędzie", TitledBorder.RIGHT, TitledBorder.BOTTOM));
        this.getContentPane().setLayout(new GridLayout(2, 1));

        this.getContentPane().add(panelRadio);
        this.getContentPane().add(panelKrawedzi);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JPanel panelRadio = new JPanel();
    JPanel panelKrawedzi = new JPanel();
    ButtonGroup grupaRadio = new ButtonGroup();

    private void dodajPrzelacznik(final String nazwa, final Border kr){
        JRadioButton przelacznik = new JRadioButton(nazwa);
        przelacznik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelKrawedzi.setBorder(BorderFactory.createTitledBorder(kr, nazwa));
            }
        });

        grupaRadio.add(przelacznik);
        panelRadio.add(przelacznik);
    }

    public static void main(String[] args) {

        new Krawedzie().setVisible(true);
    }
}

package udemy;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class podzieleniepanel extends JFrame {
    public podzieleniepanel(){
        initComponents();
    }
    public void initComponents(){
        this.setTitle("Podzielenie Ramki");
        this.setBounds(300,300,300,300);

        panelListy.add(lista);
        panelObrazka.add(obrazek);
        panelOpisu.add(opis);

        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if  (!e.getValueIsAdjusting()){
                    Obrazek img = (Obrazek)((JList)e.getSource()).getSelectedValue();
                    obrazek.setIcon(img.getImage());
                    opis.setText(img.getDescription());
                }
            }
        });

        JSplitPane podzielenie = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelListy, panelObrazka);
        JSplitPane podzielenieGlowne = new JSplitPane(JSplitPane.VERTICAL_SPLIT, podzielenie, panelOpisu);

        this.getContentPane().add(podzielenieGlowne);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JPanel panelListy = new JPanel();
    JPanel panelObrazka = new JPanel();
    JPanel panelOpisu = new JPanel();
    JList lista = new JList(new Obrazek[]{
            new Obrazek("blue2", "mlem mlem"),
            new Obrazek("red2","xoxoxoxo"),
            new Obrazek("green2","huehuehue")});

    JLabel obrazek = new JLabel();
    JLabel opis = new JLabel();

    private class Obrazek{
        public Obrazek(String nazwa, String opis){

            this.nazwa = nazwa;
            this.opis = opis;

            obrazek = new ImageIcon(this.getClass().getResource("/obrazki/" + nazwa + ".jpg"));
        }

        public String toString(){
            return nazwa;
        }
        public ImageIcon getImage(){
            return obrazek;
        }
        public String getDescription(){
            return opis;
        }
        String nazwa, opis;
        ImageIcon obrazek;
    }

    public static void main(String[] args) {
        new podzieleniepanel().setVisible(true);
    }
}

package udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listykombinowane extends JFrame {

    public listykombinowane(){
        initComponents();
    }
    public void initComponents(){
        this.setTitle("Listy Kombinowane");
        this.setBounds(300,300,300,300);

        kombinacja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ColorHandler handler = (ColorHandler) ((JComboBox)e.getSource()).getSelectedItem();

                ((JComboBox)e.getSource()).setBackground(handler.getColor());
            }
        });


        panel.add(kombinacja);

        kombinacja.addItem(new ColorHandler("Czarny", Color.BLACK));
        kombinacja.addItem(new ColorHandler("Zielony", Color.GREEN));
        kombinacja.addItem(new ColorHandler("Czerwony", Color.RED));
        kombinacja.addItem(new ColorHandler("Różowy", Color.PINK));
        kombinacja.addItem(new ColorHandler("Szary", Color.GRAY));


        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(3);
    }

    private class ColorHandler{
        public ColorHandler(String colorName, Color kolor){
            this.kolor = kolor;
            this.colorName = colorName;
        }

        public String toString(){
            return this.colorName;
        }

        public Color getColor(){
            return this.kolor;
        }

        private Color kolor;
        private String colorName;
    }

    private JPanel panel = new JPanel();
    private JComboBox kombinacja = new JComboBox();

    public static void main(String[] args) {
        new listykombinowane().setVisible(true);
    }
}

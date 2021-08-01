package udemy;

import javax.swing.*;

public class listy extends JFrame {
    public listy(){
        initComponents();
    }

    public void initComponents(){
        this.setTitle("Lista");
        this.setBounds(300, 300, 300, 300);


        this.getContentPane().add(listaPrzedmiotow);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JList listaPrzedmiotow = new JList(new String[]{"Matematyka", "Fizyka","Informatyla","Biologia","Chemia","WOS","PO","Historia"});

    public static void main(String[] args) {
        new listy().setVisible(true);
    }
}

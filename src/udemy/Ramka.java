package udemy;

import javax.swing.*;

public class Ramka extends JFrame {

    public Ramka(){
        initComponents();
    }
    public void initComponents(){
        this.setTitle("Ramka");
        this.setBounds(300,300,300,300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

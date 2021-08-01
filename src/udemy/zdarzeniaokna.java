package udemy;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class zdarzeniaokna extends JFrame {

    public zdarzeniaokna(){
        initComponents();
    }

    public void initComponents(){
        this.setTitle("Pola wyboru");
        this.setBounds(300,300,300,300);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Witaj");
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new zdarzeniaokna().setVisible(true);
    }


    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Witaj");
    }


    public void windowClosing(WindowEvent e) {
        int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy napewno chcesz zamknąć?");
        if (opcja == 0){
            this.dispose();
        }

    }


    public void windowClosed(WindowEvent e) {
        System.out.println("Zapisujemy dane na dysku");
    }


    public void windowIconified(WindowEvent e) {
        System.out.println("Jestem minimalizowany");
    }


    public void windowDeiconified(WindowEvent e) {
        System.out.println("Jestem maksymalizowany");
    }


    public void windowActivated(WindowEvent e) {
        System.out.println("Jestem aktywny");
    }


    public void windowDeactivated(WindowEvent e) {
        System.out.println("Jestem nieaktywny");
    }
}

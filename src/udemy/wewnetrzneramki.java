package udemy;

import javax.swing.*;
import java.awt.*;

public class wewnetrzneramki extends JFrame {
    public wewnetrzneramki(){
        iniComponents();
    }
    public void iniComponents(){
        this.setTitle("Wewnętrzne Ramki");
        this.setBounds(300,300,300,300);

        this.getContentPane().add(deskopPane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JDesktopPane deskopPane = new JDesktopPane();

    public static void main(String[] args) {
        new wewnetrzneramki().setVisible(true);
    }
}

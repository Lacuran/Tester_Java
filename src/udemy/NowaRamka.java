package udemy;

import javax.swing.*;

public class NowaRamka extends JFrame {

    public NowaRamka(JFrame parent){
        initComponents();

        int szer = (int)parent.getBounds().getWidth();
        int wys = (int)parent.getBounds().getHeight();
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;

        this.setLocation(parent.getBounds().x + (szer - szerRamki) / 2, parent.getBounds().y + (wys - wysRamki) / 2);

    }
    public void initComponents(){
        this.setTitle("Nowa Ramka Numer: " + (++ i ));
        this.setBounds(200,200,200,200);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    static int i = 0;
}

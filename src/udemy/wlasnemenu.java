package udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class wlasnemenu extends JFrame {

    public wlasnemenu(){
        initComponents();
    }

    public void initComponents() {
        this.setTitle("Własne Menu");
        this.setBounds(300,300,300,300);

        panelMenu.setLayout(new GridLayout(3,1));
        panelMenu.add(menu1);
        panelMenu.add(menu2);
        panelMenu.add(menu3);

        kontener.add(panelMenu);
        this.setDefaultCloseOperation(3);
    }

    private int i = 0;
    private Container kontener = this.getContentPane();
    private JPanel panelMenu = new JPanel();
    private MenuButton menu1 = new MenuButton("1. Dodaj");
    private MenuButton menu2 = new MenuButton("2. Usuń");
    private MenuButton menu3 = new MenuButton("3. Zmień");


    private class MenuButton extends JButton implements FocusListener, ActionListener {

        private Color kFocusGained = Color.RED;
        private Color kDefault = Color.BLUE;


        private void keyPressedHandler(KeyEvent e){

            int dlMenu = panelMenu.getComponentCount();

            if (i == 0) i = 10 * dlMenu;
            if (i == 60) i = 10 * dlMenu;

            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                panelMenu.getComponent(++i % dlMenu).requestFocus();
            }
            else if (e.getKeyCode() == KeyEvent.VK_UP){
                panelMenu.getComponent(--i % dlMenu).requestFocus();
            }
            else if (e.getKeyCode() == KeyEvent.VK_ENTER){
                ((MenuButton)e.getSource()).doClick();
            }
        }

        public MenuButton(String nazwa){

            super(nazwa);
            this.addFocusListener(this);
            this.addActionListener(this);

            this.addKeyListener(new KeyAdapter() {
                //gdy nacisne literę a to najpierw jest wywoływany KeyPresees, KeyTyped, KeyRelease
                @Override
                public void keyReleased(KeyEvent e) {
                    keyPressedHandler(e);
                }
            });
            this.setBackground(kDefault);
        }

        @Override
        public void focusGained(FocusEvent e) {
            this.setBackground(kFocusGained);
        }

        @Override
        public void focusLost(FocusEvent e) {
            this.setBackground(kDefault);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(this, ((MenuButton)e.getSource()).getText());
        }
    }

    public static void main(String[] args) {

        new wlasnemenu().setVisible(true);
    }
}

package udemy;

import javax.swing.*;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import java.awt.*;

public class wewnetrzneramki extends JFrame {
    public wewnetrzneramki(){
        iniComponents();
    }
    public void iniComponents(){
        this.setTitle("Wewnętrzne Ramki");
        this.setBounds(300,300,300,300);

        JInternalFrame wewnRamka = new JInternalFrame("Rameczki", true, true, true, true);
        JInternalFrame wewRamka2 = new JInternalFrame("Ramka 2", true, true, true ,true);
        wewnRamka.add(new JButton("teścior"), BorderLayout.NORTH);
        wewnRamka.setVisible(true);
        wewnRamka.pack();

        wewnRamka.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);

        wewRamka2.add(new JLabel("Test 2"));
        wewRamka2.setVisible(true);
        wewRamka2.pack();

        //ustawia ikone
        //wewnRamka.setFrameIcon(icon);

        wewnRamka.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                System.out.println("Otwarte");
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                String odp = JOptionPane.showInternalInputDialog(e.getInternalFrame(), "Wpisz 'wyjście' by wyjść z programu całego lub zamknij by zamknąć tylko ramke");

                if (odp != null)
                    if (odp.equals("wyjście"))
                        System.exit(0);
                    else if (odp.equals("zamknij"))
                        e.getInternalFrame().dispose();
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                System.out.println("Zamknieta");
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                System.out.println("zminimalizacja");
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                System.out.println("maksymalizacja");
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                System.out.println("Aktywacja");
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                System.out.println("Deaktywacja");
            }
        });

        deskopPane.add(wewnRamka);
        deskopPane.add(wewRamka2);


        this.getContentPane().add(deskopPane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JDesktopPane deskopPane = new JDesktopPane();

    public static void main(String[] args) {
        new wewnetrzneramki().setVisible(true);
    }
}

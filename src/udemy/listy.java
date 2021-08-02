package udemy;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class listy extends JFrame {
    public listy(){
        initComponents();
    }

    public void initComponents(){
        this.setTitle("Lista");
        this.setBounds(300, 300, 300, 300);

        listaPrzedmiotow.setVisibleRowCount(4);
        listaPrzedmiotow.setFixedCellHeight(25);
        listaPrzedmiotow.setFixedCellWidth(100);
        listaPrzedmiotow.setBackground(Color.GRAY);
        listaPrzedmiotow.setSelectionForeground(Color.BLUE);

        //listaPrzedmiotow.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        listaPrzedmiotow.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        listaPrzedmiotow.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println("Zmieniłem się " + (++i));

                if (e.getValueIsAdjusting())
                    System.out.println("Trzymam przycisk myszy");
                else
                    System.out.println("Puściłem button myszy");

                if (!e.getValueIsAdjusting()){
                    Object[] wartosciWLiscie = ((JList)e.getSource()).getSelectedValues();

                    String przedmioty = "";

                    for(int i = 0; i < wartosciWLiscie.length; i++)
                        przedmioty += (String) wartosciWLiscie[i] + ", ";

                    System.out.println(przedmioty);

                    komunikat.setText("Nie lubię następujących przedmiotów: " + przedmioty);
                }
            }
        });



        panelListy.add(scrollListy);
        panelKomunikatu.add(komunikat);

        this.getContentPane().add(panelListy, BorderLayout.NORTH);
        this.getContentPane().add(panelKomunikatu, BorderLayout.CENTER);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private  int i = 0;
    private JList listaPrzedmiotow = new JList(new String[]{"Matematyka", "Fizyka","Informatyla","Biologia","Chemia","WOS","PO","Historia"});
    private JPanel panelListy = new JPanel();
    private JScrollPane scrollListy = new JScrollPane(listaPrzedmiotow);
    private JPanel panelKomunikatu = new JPanel();
    private JLabel komunikat = new JLabel();

    public static void main(String[] args) {
        new listy().setVisible(true);
    }
}

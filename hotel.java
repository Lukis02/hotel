import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

import datechooser.beans.DateChooserCombo;
import datechooser.beans.DateChooserDialog;

public class hotel extends JFrame {
    private boolean reservas;
    public static Scanner sc = new Scanner(System.in);
    public static String clientes = sc.nextLine();
    private static JCheckBox doble, suite;
    private static JButton aceptar, reiniciar;
    private static DateChooserCombo Entrada;
    private static DateChooserCombo Salida;

    public hotel() {
        super ("Hotel el pepe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,2,50,50));
        Entrada = new DateChooserCombo();
        Salida = new DateChooserCombo();
        p1.add(Entrada);
        p1.add(Salida);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4,2));
        doble = new JCheckBox("Marque si el cliente desea una habitación doble");
        p3.add(doble);
        p2.add(p3);
        suite = new JCheckBox("Marque si el cliente desea una suite");
        Entrada = new DateChooserCombo();
        Salida = new DateChooserCombo();
        p2.add(Entrada, Salida);
        aceptar = new JButton("confirmar");
        reiniciar = new JButton ("reiniciar");
        p1.add(p2);
        add(p1);
        setSize(800, 600);
        setVisible(true);

    }

    public static void main(String[] args) { hotel ht = new hotel(); }
    private class doble implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (doble.isSelected() == true) {

            }
        }
    private class suite implements ActionListener{
            @Override
        public void actionPerformed (ActionEvent e) {
                if(suite.isSelected() == true) {

                }
            }
    private class aceptar implements ActionListener{
                @Override
        public void actionPerformed (ActionEvent e ) {
                if(aceptar.isSelected() == true){

                }
    }
    private class reiniciar implements ActionListener{
                @Override
        public void actionPerformed (ActionEvent e) {
                if(reiniciar.isSelected() == true){

                }
                }
                }
    }
    }
    }



    }
import javax.swing.*;
import java.awt.*;
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



        }

    public static void main(String[] args) {
    }



    }